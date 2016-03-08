package org.cserny.spring.knights.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.cserny.spring.knights.service.Minstrel;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by user on 08.03.2016.
 */
@Aspect
public class KnightAspect
{
    protected Minstrel minstrel;

    @Autowired
    public void setMinstrel(Minstrel minstrel)
    {
        this.minstrel = minstrel;
    }

    @Before("execution(* org.cserny.spring.knights.BraveKnight.embarkOnQuest(..))")
    public void singForKnightBefore()
    {
        minstrel.singBeforeQuest();
    }

    @After("execution(* org.cserny.spring.knights.BraveKnight.embarkOnQuest(..))")
    public void singForKnightAfter()
    {
        minstrel.singAfterQuest();
    }
}
