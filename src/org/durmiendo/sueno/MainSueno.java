package org.durmiendo.sueno;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import org.durmiendo.sueno.content.SBlock;
import org.durmiendo.sueno.content.SPlanets;
import org.durmiendo.sueno.ui.SUI;

public class MainSueno extends Mod {
    public SUI sui;
    public MainSueno(){


        Events.on(ClientLoadEvent.class, e -> Time.runTask(15f, () -> {
            BaseDialog dialog = new BaseDialog("Welcome to the Sueno 0.1.1");
            dialog.cont.button("Close", dialog::hide).size(100f, 50f);
            dialog.show();
        }));



    }

    @Override
    public void loadContent(){

        sui = new SUI();
        sui.init();
        SPlanets.load();
        SBlock.load();
        Log.info("Loading some Sueno content.");
    }
}
