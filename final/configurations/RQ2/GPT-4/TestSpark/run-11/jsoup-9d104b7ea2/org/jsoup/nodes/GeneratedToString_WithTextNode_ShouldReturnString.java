package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedToString_WithTextNode_ShouldReturnString {

    @Test
    public void toString_WithTextNode_ShouldReturnString() {
        TextNode textNode = new TextNode("TestNode");
        Assert.assertEquals("TestNode", textNode.toString());
    }

}