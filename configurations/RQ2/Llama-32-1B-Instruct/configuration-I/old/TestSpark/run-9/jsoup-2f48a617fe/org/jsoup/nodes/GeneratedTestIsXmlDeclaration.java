package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        Document document = new Document();
        Element commentElement = document.createElement("comment");
        commentElement.appendChild(document.createTextNode("This is a sample comment"));
        commentElement.outerHtmlHead(document, 1, null);
        assertTrue(commentElement.isXmlDeclaration());
    }

}