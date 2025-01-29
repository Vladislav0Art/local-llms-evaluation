package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestDeduplicateTest {

    private Document doc = new Document();

    @Test
    public void testDeduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.deduplicate(doc.toString());
        String deduplicatedHtml = doc.toString();
        System.out.println(deduplicatedHtml);
    }

}