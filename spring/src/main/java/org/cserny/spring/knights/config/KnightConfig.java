package org.cserny.spring.knights.config;

import org.cserny.spring.knights.BraveKnight;
import org.cserny.spring.knights.Knight;
import org.cserny.spring.knights.Quest;
import org.cserny.spring.knights.SlayDragonQuest;
import org.cserny.spring.knights.service.Minstrel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by user on 03.03.2016.
 */
@Configuration
public class KnightConfig
{
    @Bean
    public Knight knight()
    {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest()
    {
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Minstrel minstrel()
    {
        return new Minstrel(System.out);
    }
}
