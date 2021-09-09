package org.geoserver.gwc.web.blob;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.ResourceModel;
import org.geowebcache.elasticsearch.ElasticsearchBlobStoreInfo;

/**
 * @author shimingen
 * @date 2021/9/2
 */
public class ElasticsearchBlobStorePanel<T extends ElasticsearchBlobStoreInfo> extends Panel {
    public ElasticsearchBlobStorePanel(String id) {
        super(id);
    }

    public ElasticsearchBlobStorePanel(String id, IModel<?> configurationModel) {
        super(id, configurationModel);
        add(
                new TextField<String>("hosts")
                        .setRequired(true)
                        .add(new AttributeModifier("hosts", new ResourceModel("hosts"))));
        add(
                new TextField<String>("connectionRequestTimeout")
                        .setRequired(false)
                        .add(
                                new AttributeModifier(
                                        "connectionRequestTimeout",
                                        new ResourceModel("connectionRequestTimeout"))));
        add(
                new TextField<String>("connectTimeout")
                        .setRequired(false)
                        .add(
                                new AttributeModifier(
                                        "connectTimeout", new ResourceModel("connectTimeout"))));
        add(
                new TextField<String>("socketTimeout")
                        .setRequired(false)
                        .add(
                                new AttributeModifier(
                                        "socketTimeout", new ResourceModel("socketTimeout"))));

        add(
                new TextField<String>("username")
                        .setRequired(false)
                        .add(new AttributeModifier("username", new ResourceModel("username"))));
        add(
                new TextField<String>("password")
                        .setRequired(false)
                        .add(new AttributeModifier("password", new ResourceModel("password"))));
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
