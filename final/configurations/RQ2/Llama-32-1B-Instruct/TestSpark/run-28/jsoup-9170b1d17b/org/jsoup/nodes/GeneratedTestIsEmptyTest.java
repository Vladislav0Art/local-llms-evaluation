package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestIsEmptyTest {

    private Document doc = new Document();

    @Test
    public void testIsEmptyTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            System.out.println(element.get("key"));
        }
        System.out.println(Attributes.isEmpty(doc));
    }

}