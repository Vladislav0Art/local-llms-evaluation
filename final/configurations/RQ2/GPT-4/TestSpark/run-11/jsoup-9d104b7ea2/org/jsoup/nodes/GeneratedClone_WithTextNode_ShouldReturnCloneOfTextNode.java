package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedClone_WithTextNode_ShouldReturnCloneOfTextNode {

    @Test
    public void clone_WithTextNode_ShouldReturnCloneOfTextNode() {
        TextNode textNode = new TextNode("TestNode");
        TextNode cloneNode = textNode.clone();
        Assert.assertEquals(textNode.toString(), cloneNode.toString());
    }

}