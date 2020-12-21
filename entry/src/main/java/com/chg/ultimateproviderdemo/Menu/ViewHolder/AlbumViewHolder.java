package com.chg.ultimateproviderdemo.Menu.ViewHolder;

import com.chg.ultimateprovider.EventTransmissionListener;
import com.chg.ultimateprovider.ViewHolder;
import com.chg.ultimateproviderdemo.Menu.Model.AlbumModel;
import com.chg.ultimateproviderdemo.ResourceTable;
import ohos.agp.components.Component;
import ohos.agp.components.Image;
import ohos.agp.components.Text;

public class AlbumViewHolder extends ViewHolder<AlbumModel> {

    private Image icon;
    private Text name;
    private Text songer;

    public AlbumViewHolder(EventTransmissionListener eventTransmissionListener, Component component) {
        super(eventTransmissionListener, component);
        icon = (Image) findComponentById(ResourceTable.Id_icon);
        name = (Text) findComponentById(ResourceTable.Id_name);
        songer = (Text) findComponentById(ResourceTable.Id_songer);
    }

    @Override
    public void onBindModel() {
        name.setText(getModel().getName());
        songer.setText(getModel().getSonger());
    }
}
