package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedInsertStartTagTest {

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "/", new Parser(xmlTreeBuilder));

        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("newTag");
        Element newTag = xmlTreeBuilder.insert(startTag);

        Node childNode = xmlTreeBuilder.currentElement().childNode(0);

        assertTrue(childNode instanceof Element);
        assertEquals(newTag, childNode);
        assertEquals("newTag", childNode.nodeName());
    }

}