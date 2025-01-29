package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestInsertNodeNoText {

    @Test
    public void testInsertNodeNoText() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.StartTag));
        assertEquals(1, ((Element) rootElement).getElementsByTagName("a").item(0).children().size());
    }

}