package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedIsXmlDeclarationReturnsTrueForXmlDeclaration {

    @Test
    public void isXmlDeclarationReturnsTrueForXmlDeclaration() throws IOException {
        Document document = new Document("<!DOCTYPE html> <!-- Some xml declaration -->");
        Element element = document.getElementById("root");
        XmlDeclaration xmlDeclaration = (XmlDeclaration) element.childNodes().get(0);
        Comment comment = (Comment) xmlDeclaration;
        assertTrue(comment.isXmlDeclaration());
    }

}