package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestHasKeyIgnoreCaseTest {

    private Document doc = new Document();

    @Test
    public void testHasKeyIgnoreCaseTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            System.out.println(element.get("key") + ": " + element.getValue());
        }
    }

}