package org.geoserver.gwc.web.blob;

import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.geowebcache.mongo.MongoBlobStoreInfo;

/**
 * @author shimingen
 * @date 2021/9/2
 */
public class MongoBlobStoreType implements BlobStoreType<MongoBlobStoreInfo> {
    @Override
    public Class<MongoBlobStoreInfo> getConfigClass() {
        return MongoBlobStoreInfo.class;
    }

    @Override
    public MongoBlobStoreInfo newConfigObject() {
        MongoBlobStoreInfo config = new MongoBlobStoreInfo();
        config.setEnabled(true);
        return config;
    }

    @Override
    public Panel createPanel(String id, IModel<MongoBlobStoreInfo> model) {
        return new MongoBlobStorePanel<>(id, model);
    }

    @Override
    public String toString() {
        return "Mongo BlobStore";
    }
}
