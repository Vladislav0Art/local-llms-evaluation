package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Some text");
        TextNode clonedTextNode = textNode.clone();
        Assert.assertEquals(textNode.text(), clonedTextNode.text());
    }

}