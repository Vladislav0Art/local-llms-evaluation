package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class GeneratedInsertTokenStartTagTest {

    @Test
    public void insertTokenStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.parse("<root></root>", "");
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("newTag");
        Element result = xmlTreeBuilder.insert(startTag);
        assertEquals("newTag", result.tagName());
    }

}