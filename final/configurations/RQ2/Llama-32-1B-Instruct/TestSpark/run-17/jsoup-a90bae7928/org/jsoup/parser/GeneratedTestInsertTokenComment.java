package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestInsertTokenComment {

    @Test
    public void testInsertTokenComment() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.Comment, "This is a comment")));
        assertEquals("This is a comment", ((Element) ((Node) rootElement).getElementsByTagName("comment").item(0)).text());
    }

}