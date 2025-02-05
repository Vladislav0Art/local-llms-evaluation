package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCloneTest {

    @Test
    public void CloneTest() {
        TextNode textNode = new TextNode("test text");
        TextNode clonedTextNode = textNode.clone();
        Assert.assertNotEquals(textNode, clonedTextNode);
        Assert.assertEquals(textNode.text(), clonedTextNode.text());
    }

}