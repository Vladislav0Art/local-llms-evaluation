package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestOuterHtmlHead {

    public static Document getDocument() throws IOException {
        Document document = new Document();
        Element head = document.createElement("head");
        // ... add elements to the head ...
        return document;
    }

    public static String getHTML(Document document) {
        return document.outerHtml().substring(7);
    }
}

public class GeneratedTest {

    @Test
    public void testOuterHtmlHead() throws IOException, InterruptedException {
        Document document = TestUtil.getDocument();
        Element head = document.createElement("head");
        // ... add elements to the head ...
        String html = TestUtil.getHTML(document);
        assertEquals("test", html);

        assertTrue(document.isBlank());

        assertEquals("hello ", TestUtil.getHTML(document).substring(7));
    }

}