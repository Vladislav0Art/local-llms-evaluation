package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Hello World");
        TextNode clonedNode = textNode.clone();
        Assert.assertEquals(textNode.getWholeText(), clonedNode.getWholeText());

        // Make sure changing original doesn't affect clone
        textNode.text("Hello Jsoup");
        Assert.assertNotEquals(textNode.getWholeText(), clonedNode.getWholeText());
    }

}