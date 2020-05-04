package page;


import Setting.RunCucumberTest;
import com.codeborne.selenide.SelenideElement;
import org.reflections.Reflections;
import page.annotations.Element;
import page.annotations.Page;
import steps.HookTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Set;

public class AbstractPage {

       static   Reflections reflections = new Reflections(AbstractPage.class.getPackage().getName());
       static Set<Class<?>> CLASSES = reflections.getTypesAnnotatedWith(Page.class);


      /*  for(Class cls: classes) {
            Page target = (Page) cls.getAnnotation(.class);
            System.out.println(target.value());
        }*/

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
        for (Class<? > clazz : CLASSES) {
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

}
