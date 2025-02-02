package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestCommentOuterHtmlHead_2 {

    @Test
    public void testCommentOuterHtmlHead_2() throws IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.File("/path/to/test.html"));

        Element comment = document.getElementById("comment");
        assertEquals("<!--Hello, world!-->", elementToString(comment));
    }

}