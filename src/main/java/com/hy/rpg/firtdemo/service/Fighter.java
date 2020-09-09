package com.hy.rpg.firtdemo.service;

import com.hy.rpg.firtdemo.domian.DebuffInfo;
import com.hy.rpg.firtdemo.domian.FightAbility;

public interface Fighter {

    void TimePassBy(float second);

    boolean IsAlive();

    FightAbility GetFightAbility();

    void ObtainDamageByFighter(float damage, Fighter attacker);

    void ObtainDamageByDeBuff(float damage, DebuffInfo debuffInfo);


}
