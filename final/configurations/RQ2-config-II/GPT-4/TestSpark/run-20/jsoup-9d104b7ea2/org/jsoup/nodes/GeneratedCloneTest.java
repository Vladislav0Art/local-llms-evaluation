package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("test");
        TextNode clonedNode = textNode.clone();
        Assert.assertEquals(textNode.text(), clonedNode.text());
    }

}