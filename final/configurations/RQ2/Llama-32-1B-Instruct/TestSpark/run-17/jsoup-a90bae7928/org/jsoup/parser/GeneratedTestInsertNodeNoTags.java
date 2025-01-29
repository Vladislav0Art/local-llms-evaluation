package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestInsertNodeNoTags {

    @Test
    public void testInsertNodeNoTags() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.StartTag));
        assertEquals(null, ((Element) rootElement).getElementsByTagName("a").item(0).children());
    }

}