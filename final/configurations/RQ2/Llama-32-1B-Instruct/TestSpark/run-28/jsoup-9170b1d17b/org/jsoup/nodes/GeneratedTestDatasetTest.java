package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestDatasetTest {

    private Document doc = new Document();

    @Test
    public void testDatasetTest() {
        Attributes attributes = new Attributes();
        attributes.dataset(doc.toString(), 1000);
        Map<String, String> map = new AbstractMap.SimpleImmutableMap<>();
        for (Attribute attribute : attributes.dataset().values()) {
            map.put(attribute.getKey(), attribute.getValue());
        }
        System.out.println(map);
    }

}