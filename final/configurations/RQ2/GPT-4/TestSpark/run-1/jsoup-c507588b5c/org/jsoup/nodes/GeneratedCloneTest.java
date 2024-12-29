package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Test");
        TextNode cloneNode = textNode.clone();
        Assert.assertNotSame(textNode, cloneNode);
        Assert.assertEquals(textNode.text(), cloneNode.text());
    }

}