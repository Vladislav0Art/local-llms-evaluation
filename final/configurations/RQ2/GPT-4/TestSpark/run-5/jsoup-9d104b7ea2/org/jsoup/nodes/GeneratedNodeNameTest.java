package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Parser;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        String text = "test text";
        TextNode node = new TextNode(text);
        Assert.assertEquals("#text", node.nodeName());
    }

}