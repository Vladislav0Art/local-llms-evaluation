package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Clone Test");
        TextNode clonedNode = textNode.clone();
        Assert.assertNotSame(clonedNode, textNode);
        Assert.assertEquals(clonedNode.getWholeText(), textNode.getWholeText());
    }

}