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

public class GeneratedInsertNodeTest {

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "/", new Parser(xmlTreeBuilder));

        Element currentElement = xmlTreeBuilder.currentElement();
        Element newNode = new Element(Tag.valueOf("newNode"), "/");
        xmlTreeBuilder.insertNode(newNode);

        Node childNode = currentElement.childNode(0);
        assertEquals(newNode, childNode);
    }

}