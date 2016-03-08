package org.cserny.spring.knights;

import org.cserny.spring.knights.config.KnightConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 03.03.2016.
 */
public class BraveKnightRun
{
    public static void main(String[] args)
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);

        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
