package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationMethodReturnsCorrectXmlDeclaration {

    @Test
    public void asXmlDeclarationMethodReturnsCorrectXmlDeclaration() {
        Parser parser = new Parser();
        Document document = parser.parse("<div><?xml version=\"1.0\"?><!-- This is a comment -->\n<div>Inner div</div></div>");
        Element element = document.selectFirst("div").firstChild();
        Comment node = (Comment) element;
        XmlDeclaration xmlDeclaration = node.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}