package page;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.reflections.Reflections;
import page.annotations.Element;
import page.annotations.Page;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.*;


public class    AbstractPage {

    static final Reflections reflections = new Reflections("page");
    static Set<Class<?>> CLASSES = reflections.getTypesAnnotatedWith(Page.class);


   /* static final LinkedList<Class<? extends AbstractPage>> CLASSES = new LinkedList<>();

    static {
        CLASSES.add(MainPage.class);
        CLASSES.add(TopicPage.class);
        CLASSES.add(loginPage.class);
    }*/

    public static String getUrlByTitle(String title) throws ClassNotFoundException {
        for (Class<?> clazz : CLASSES) {
            if (clazz.isAnnotationPresent(Page.class)) {
                if (clazz.getAnnotation(Page.class).title().equals(title)) {
                    return clazz.getAnnotation(Page.class).url();
                }
            }
        }
        throw new ClassNotFoundException("Окно с заголовком " + title + " не найдено в списке");
    }

    public static AbstractPage getPageByTitle(String title) throws ClassNotFoundException {
        for (Class<?> clazz : CLASSES) {
            if (clazz.isAnnotationPresent(Page.class)) {
                if (clazz.getAnnotation(Page.class).title().equals(title)) {
                    try {
                        return (AbstractPage) clazz.newInstance();
                    } catch (InstantiationException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        throw new ClassNotFoundException("Окно с заголовком " + title + " не найдено в списке");
    }

    public SelenideElement getElementByName(String name) {
           for (Method method : this.getClass().getMethods()) {
               if (method.isAnnotationPresent(Element.class)) {
                   Element element = method.getAnnotation(Element.class);
                   if (element.value().equals(name)) {
                       try {
                           return (SelenideElement) method.invoke(this);
                       } catch (IllegalAccessException | InvocationTargetException e) {
                           e.printStackTrace();
                       }
                   }
               }
           }

        throw new RuntimeException(" вылет на получение элемента");
    }
    public ElementsCollection getElementsByName(String name) {
        for (Method method : this.getClass().getMethods()) {
            if (method.isAnnotationPresent(Element.class)) {
                Element element = method.getAnnotation(Element.class);
                if (element.value().equals(name)) {
                    try {
                        return (ElementsCollection) method.invoke(this);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        throw new RuntimeException(" вылет на получение элементов");
    }

}
