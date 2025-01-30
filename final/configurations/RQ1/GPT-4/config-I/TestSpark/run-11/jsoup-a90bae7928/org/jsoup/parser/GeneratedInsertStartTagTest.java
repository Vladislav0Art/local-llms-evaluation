package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertStartTagTest {

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<tag>content</tag>"), "http://base.uri/", new Parser(xmlTreeBuilder));
        xmlTreeBuilder.runParser();
        Tag tag = Tag.valueOf("tag");
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr(tag.getName(), "attribute");
        startTag.attributes.put("attribute", "value");
        Element element = xmlTreeBuilder.insert(startTag);
        assertTrue(element.hasAttr("attribute"));
        assertEquals("value", element.attr("attribute"));
    }

}