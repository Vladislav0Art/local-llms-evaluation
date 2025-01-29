package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestInsertNode {

    @Test
    public void testInsertNode() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.StartTag, "a")));
        assertEquals("a", ((Token) ((Element) rootElement).getElementsByTagName("a").item(0)).text());
    }

}