package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestInsertTokenEndTag {

    @Test
    public void testInsertTokenEndTag() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.EndTag, "root"));
        assertEquals("<root>", ((Element) ((Node) rootElement).getElementsByTagName("root").item(0)).text());
    }

}