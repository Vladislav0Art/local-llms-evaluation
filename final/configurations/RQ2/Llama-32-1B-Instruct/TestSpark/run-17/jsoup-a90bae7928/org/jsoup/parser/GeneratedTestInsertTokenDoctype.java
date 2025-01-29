package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestInsertTokenDoctype {

    @Test
    public void testInsertTokenDoctype() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.Doctype, "DOCTYPE"));
        assertEquals("DOCTYPE", ((Element) ((Node) rootElement).getElementsByTagName("doctype").item(0)).text());
    }

}