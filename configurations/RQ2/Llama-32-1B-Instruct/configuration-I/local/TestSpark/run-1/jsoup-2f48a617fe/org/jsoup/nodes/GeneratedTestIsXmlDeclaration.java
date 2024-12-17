package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestIsXmlDeclaration {

    public static String createComment(String content) {
        Document document = new Document();
        Element comment = document.createElement("comment");
        comment.setAttribute("type", "application/xml");
        comment.appendChild(document.createTextNode(content));
        document.appendChild(comment);
        return comment.toString().trim();
    }

    @Test
    public void testIsXmlDeclaration() {
        String xmlDeclaration = createComment("<!DOCTYPE html><html><body></body></html>");
        assertTrue(Comment.isXmlDeclaration(xmlDeclaration));
    }

}