package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestCommentOuterHtmlHead {

    @Test
    public void testCommentOuterHtmlHead() throws IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.File("/path/to/test.html"));

        Element comment = document.getElementById("comment");
        assertEquals("#comment", comment.nodeName());

        String data = elementToString(comment);
        assertTrue(data.contains("#Hello, world!"));
    }

}