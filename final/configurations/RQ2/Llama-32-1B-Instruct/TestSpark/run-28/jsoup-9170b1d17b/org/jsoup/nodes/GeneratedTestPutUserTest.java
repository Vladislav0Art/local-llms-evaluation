package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestPutUserTest {

    private Document doc = new Document();

    @Test
    public void testPutUserTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            element.put("user", "value");
            System.out.println(element.get("key") + ": " + element.getValue());
        }
    }

}