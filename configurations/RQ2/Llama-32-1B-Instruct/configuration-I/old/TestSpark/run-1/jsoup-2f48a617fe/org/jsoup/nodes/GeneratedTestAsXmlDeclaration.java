package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestAsXmlDeclaration {

    public static String createComment(String content) {
        Document document = new Document();
        Element comment = document.createElement("comment");
        comment.setAttribute("type", "application/xml");
        comment.appendChild(document.createTextNode(content));
        document.appendChild(comment);
        return comment.toString().trim();
    }

    @Test
    public void testAsXmlDeclaration() {
        Comment comment = new Comment("This is a sample comment");
        assertNotNull(comment.asXmlDeclaration());
    }

}