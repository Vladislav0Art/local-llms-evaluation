package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedInsertStartTagTest {

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://example.com", new Parser(xmlTreeBuilder));
        Token.StartTag startTag = new Token.StartTag("root");
        startTag.attributes.add("attr", "value");
        xmlTreeBuilder.insert(startTag);
        assertEquals("<root></root>", xmlTreeBuilder.getSettings().toString());
    }

}