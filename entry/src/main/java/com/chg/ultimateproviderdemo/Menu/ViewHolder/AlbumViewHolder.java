package com.chg.ultimateproviderdemo.Menu.ViewHolder;

import com.chg.ultimateprovider.EventTransmissionListener;
import com.chg.ultimateprovider.UltimateProvider;
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

    public AlbumViewHolder(EventTransmissionListener eventTransmissionListener, Component component, UltimateProvider provider) {
        super(eventTransmissionListener, component,provider);
        icon = (Image) findComponentById(ResourceTable.Id_icon);
        name = (Text) findComponentById(ResourceTable.Id_name);
        songer = (Text) findComponentById(ResourceTable.Id_songer);
    }

    @Override
    public void onDataBound() {
        name.setText(getModel().getName());
        songer.setText(getModel().getSonger());
    }
}
