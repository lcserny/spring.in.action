package org.cserny.spring.knights.service;

import java.io.PrintStream;

/**
 * Created by user on 08.03.2016.
 */
public class Minstrel
{
    protected PrintStream stream;

    public Minstrel(PrintStream stream)
    {
        this.stream = stream;
    }

    public void singBeforeQuest()
    {
        stream.println("Pa la la, the knight is so brave");
    }

    public void singAfterQuest()
    {
        stream.println("Yee hee hee, the brave knight did embark on a quest");
    }
}
