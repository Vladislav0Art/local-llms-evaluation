package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestHasDeclaredValueForKeyForcedTest {

    private Document doc = new Document();

    @Test
    public void testHasDeclaredValueForKeyForcedTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            if (!element.getKey().isEmpty()) {
                System.out.println(element.get("key") + ": " + element.getValue());
            }
        }
    }

}