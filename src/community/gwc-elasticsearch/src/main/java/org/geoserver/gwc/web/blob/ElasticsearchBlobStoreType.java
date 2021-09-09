package org.geoserver.gwc.web.blob;

import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.geowebcache.elasticsearch.ElasticsearchBlobStoreInfo;

/**
 * @author shimingen
 * @date 2021/9/2
 */
public class ElasticsearchBlobStoreType implements BlobStoreType<ElasticsearchBlobStoreInfo> {
    @Override
    public Class<ElasticsearchBlobStoreInfo> getConfigClass() {
        return ElasticsearchBlobStoreInfo.class;
    }

    @Override
    public ElasticsearchBlobStoreInfo newConfigObject() {
        ElasticsearchBlobStoreInfo config = new ElasticsearchBlobStoreInfo();
        config.setEnabled(true);
        return config;
    }

    @Override
    public Panel createPanel(String id, IModel<ElasticsearchBlobStoreInfo> model) {
        return new ElasticsearchBlobStorePanel<>(id, model);
    }

    @Override
    public String toString() {
        return "Elasticsearch BlobStore";
    }
}
