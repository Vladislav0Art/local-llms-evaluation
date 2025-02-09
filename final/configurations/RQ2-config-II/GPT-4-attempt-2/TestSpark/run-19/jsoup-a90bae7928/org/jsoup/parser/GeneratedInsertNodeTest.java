package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertNodeTest {

    @Test
    public void insertNodeTest() {
        Node mockNode = Mockito.mock(Node.class);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insertNode(mockNode);
        Assert.assertNotNull(xmlTreeBuilder);
    }

}