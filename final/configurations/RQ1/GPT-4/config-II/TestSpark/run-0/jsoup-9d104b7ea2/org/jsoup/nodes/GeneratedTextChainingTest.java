package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextChainingTest {

    @Test
    public void textChainingTest() {
        TextNode textNode = new TextNode("Java");
        TextNode changedNode = textNode.text("Python");
        Assert.assertEquals(changedNode, textNode);
    }

}