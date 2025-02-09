package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.*;
import org.jsoup.nodes.*;

public class GeneratedInsertNodeTest {

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Node node = new TextNode("text", "baseUri");
        xmlTreeBuilder.insertNode(node);
        Assert.assertEquals("text", xmlTreeBuilder.stack.getLast().outerHtml());
    }

}