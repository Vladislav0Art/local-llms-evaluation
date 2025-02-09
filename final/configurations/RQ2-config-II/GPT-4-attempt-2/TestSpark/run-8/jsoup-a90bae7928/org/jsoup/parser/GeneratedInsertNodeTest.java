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
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insertNode(new TextNode("Test"));
        Assert.assertEquals(1, builder.stack.size());
    }

}