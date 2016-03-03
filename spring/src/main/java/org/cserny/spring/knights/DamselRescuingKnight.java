package org.cserny.spring.knights;

/**
 * Created by user on 03.03.2016.
 */
public class DamselRescuingKnight implements Knight
{
    Quest quest;

    public DamselRescuingKnight(Quest quest)
    {
        this.quest = quest;
    }

    public void embarkOnQuest()
    {
        quest.embark();
    }
}
