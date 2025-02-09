package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        TextNode textNode = new TextNode("testing");
        Assert.assertEquals("testing", textNode.getWholeText());
    }

}