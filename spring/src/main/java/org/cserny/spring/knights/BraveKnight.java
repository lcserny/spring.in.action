package org.cserny.spring.knights;

import org.cserny.spring.knights.service.Minstrel;

/**
 * Created by user on 03.03.2016.
 */
public class BraveKnight implements Knight
{
    protected Quest quest;

    public BraveKnight(Quest quest)
    {
        this.quest = quest;
    }

    public void embarkOnQuest()
    {
        quest.embark();
    }
}
