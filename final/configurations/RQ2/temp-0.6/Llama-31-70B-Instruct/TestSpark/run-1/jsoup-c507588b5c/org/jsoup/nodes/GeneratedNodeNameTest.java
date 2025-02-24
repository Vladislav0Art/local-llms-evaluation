package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Some text");
        String nodeName = textNode.nodeName();

        Assert.assertEquals("#text", nodeName);
    }

}