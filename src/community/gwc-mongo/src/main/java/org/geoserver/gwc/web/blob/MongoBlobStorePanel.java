package org.geoserver.gwc.web.blob;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.ResourceModel;
import org.geowebcache.mongo.MongoBlobStoreInfo;

/**
 * @author shimingen
 * @date 2021/9/2
 */
public class MongoBlobStorePanel<T extends MongoBlobStoreInfo> extends Panel {
    public MongoBlobStorePanel(String id) {
        super(id);
    }

    public MongoBlobStorePanel(String id, IModel<?> configurationModel) {
        super(id, configurationModel);
        add(
                new TextField<String>("mongoUrl")
                        .setRequired(true)
                        .add(new AttributeModifier("mongoUrl", new ResourceModel("mongoUrl"))));
        add(
                new TextField<String>("xTile")
                        .setRequired(true)
                        .add(new AttributeModifier("xTile", new ResourceModel("xTile"))));
        add(
                new TextField<String>("yTile")
                        .setRequired(true)
                        .add(new AttributeModifier("yTile", new ResourceModel("yTile"))));
        add(
                new TextField<String>("zoom")
                        .setRequired(true)
                        .add(new AttributeModifier("zoom", new ResourceModel("zoom"))));
        add(
                new TextField<String>("img")
                        .setRequired(true)
                        .add(new AttributeModifier("img", new ResourceModel("img"))));
    }
}
