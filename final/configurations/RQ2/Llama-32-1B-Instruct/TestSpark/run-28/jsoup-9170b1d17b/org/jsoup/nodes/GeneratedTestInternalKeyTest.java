package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestInternalKeyTest {

    private Document doc = new Document();

    @Test
    public void testInternalKeyTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            System.out.println(Attributes.internalKey(element.getKey()));
        }
    }

}