package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserBase;

public class GeneratedDataset_ReturnsDatasetMap {

    @Test
    public void dataset_ReturnsDatasetMap() {
        Attributes attributes = new Attributes();
        Map map = new HashMap<>();
        map.put("key1", "value1");
        assertEquals(1, ((Map) attributes.dataset()).size());
    }

}