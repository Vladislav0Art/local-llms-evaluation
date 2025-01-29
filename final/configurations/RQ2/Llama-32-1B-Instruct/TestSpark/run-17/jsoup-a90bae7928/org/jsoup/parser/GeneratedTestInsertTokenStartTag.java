package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestInsertTokenStartTag {

    @Test
    public void testInsertTokenStartTag() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.StartTag, "a"));
        assertEquals("<a>", ((Element) ((Node) rootElement).getElementsByTagName("a").item(0)).text());
    }

}