package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestInsertTokenCharacter {

    @Test
    public void testInsertTokenCharacter() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.Character, "a")));
        assertEquals("a", ((Element) ((Node) rootElement).getElementsByTagName("a").item(0)).text());
    }

}