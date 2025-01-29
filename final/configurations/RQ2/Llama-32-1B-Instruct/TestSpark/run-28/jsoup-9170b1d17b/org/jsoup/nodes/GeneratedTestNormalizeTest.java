package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestNormalizeTest {

    private Document doc = new Document();

    @Test
    public void testNormalizeTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            element.normalize();
            System.out.println(element.get("key"));
        }
    }

}