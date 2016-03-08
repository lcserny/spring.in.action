package org.cserny.spring.knights;

import org.cserny.spring.knights.config.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 03.03.2016.
 */
public class BraveKnightRun
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(KnightConfig.class);
//        context.refresh();

        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
