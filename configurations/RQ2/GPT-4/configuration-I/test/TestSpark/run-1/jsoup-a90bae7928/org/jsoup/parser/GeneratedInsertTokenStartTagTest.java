package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertTokenStartTagTest {

    @Test
    public void insertTokenStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://base.uri", Parser.xmlParser());
        Token.StartTag startTag = new Token.StartTag();
        xmlTreeBuilder.insert(startTag);
        assertNotNull(xmlTreeBuilder.stack.get(0));
    }

}