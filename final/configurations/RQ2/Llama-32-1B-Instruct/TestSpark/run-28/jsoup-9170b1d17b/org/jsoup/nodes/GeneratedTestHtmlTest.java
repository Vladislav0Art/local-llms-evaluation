package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestHtmlTest {

    private Document doc = new Document();

    @Test
    public void testHtmlTest() {
        Attributes attributes = new Attributes();
        attributes.html(doc.toString());
        String html = doc.toString();
        System.out.println(html);
    }

}