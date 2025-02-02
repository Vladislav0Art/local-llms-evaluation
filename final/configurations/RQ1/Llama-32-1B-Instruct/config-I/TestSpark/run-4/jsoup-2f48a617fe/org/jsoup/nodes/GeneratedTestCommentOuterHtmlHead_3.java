package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestCommentOuterHtmlHead_3 {

    @Test
    public void testCommentOuterHtmlHead_3() throws IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.File("/path/to/test.html"));

        Element comment = document.getElementById("comment");
        assertTrue(elementIsXmlDeclaration(comment));
    }

}