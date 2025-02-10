package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Jsoup;

public class GeneratedTestAttributesHasEmptyDataset {

    @Test
    public void testAttributesHasEmptyDataset() {
        Attributes attributes = new Attributes();
        Map<String, String> dataset = new HashMap<>();
        attributes.dataset().putAll(dataset);

        assertEquals(0, ((Map) attributes.dataset()).size());
    }

}