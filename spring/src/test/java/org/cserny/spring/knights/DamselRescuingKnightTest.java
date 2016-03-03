package org.cserny.spring.knights;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by user on 03.03.2016.
 */
public class DamselRescuingKnightTest
{

    @Test
    public void testEmbarkOnQuest() throws Exception
    {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}