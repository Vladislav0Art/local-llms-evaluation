package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestRemoveIgnoreCaseTest {

    private Document doc = new Document();

    @Test
    public void testRemoveIgnoreCaseTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            element.removeIgnoreCase("key");
            System.out.println(element.get("key"));
        }
    }

}