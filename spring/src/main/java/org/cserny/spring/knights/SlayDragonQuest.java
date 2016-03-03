package org.cserny.spring.knights;

import java.io.PrintStream;

/**
 * Created by user on 03.03.2016.
 */
public class SlayDragonQuest implements Quest
{
    PrintStream stream;

    public SlayDragonQuest(PrintStream stream)
    {
        this.stream = stream;
    }

    public void embark()
    {
        stream.println("Embarking on quest to Slay the Dragon");
    }
}
