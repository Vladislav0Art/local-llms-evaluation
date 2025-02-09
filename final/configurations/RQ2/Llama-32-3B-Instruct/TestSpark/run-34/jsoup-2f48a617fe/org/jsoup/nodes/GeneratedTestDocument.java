package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestDocument {

    private static Document document;

    @BeforeClass
    public static void initMocks() {
        String html = "<document><outputSettings><settings></settings></outputSettings></document>";
        document = Jsoup.parse(html);
    }

    public static Document getDocument() {
        return document;
    }

    public static final String TEST_DATA = "<--!>";

    @Test
    public void testDocument() {
        Document cloned = Jsoup.parse(GeneratedTest.getDocument().html());
        assertEquals(cloned.html(), document.html());
    }

}