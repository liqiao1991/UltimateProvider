package com.chg.ultimateproviderdemo.Menu.Ability;

import com.chg.ultimateproviderdemo.Menu.Slice.EventHanlderSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class EventHanlderAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(EventHanlderSlice.class.getName());
    }
}
