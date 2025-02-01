package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedInsertNodeTest {

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<tag>"), "http://base.uri", new Parser(xmlTreeBuilder));
        xmlTreeBuilder.insertNode(new TextNode("textnode"));
        Assert.assertEquals("textnode", xmlTreeBuilder.doc.text());
    }

}