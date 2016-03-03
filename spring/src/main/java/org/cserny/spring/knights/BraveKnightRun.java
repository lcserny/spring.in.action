package org.cserny.spring.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 03.03.2016.
 */
public class BraveKnightRun
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
