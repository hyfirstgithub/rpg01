package com.hy.rpg.firtdemo.service;

import java.util.function.Consumer;

public interface BattleField {

    void StartFightWithLevel(String level, Consumer<Boolean> endListener);

}
