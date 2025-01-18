package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedInsertNodeSingleTest {

    @Test
    public void insertNodeSingleTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new CDataNode("test"));
        Assert.assertEquals(1, xmlTreeBuilder.stack.size());
        Assert.assertTrue(xmlTreeBuilder.stack.get(0) instanceof CDataNode);
    }

}