package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestComments {

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
    public void testComments() {
        Element comment = (Element) GeneratedTest.getDocument().select("comment").first();
        assertEquals(TEST_DATA, comment.getData());
        assertEquals(comment.nodeName(), "comment");
    }

}