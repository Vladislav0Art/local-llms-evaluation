package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedInsertNodeTest {

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insertNode(new Node("baseUri"));
        Assert.assertTrue(true);
    }

}