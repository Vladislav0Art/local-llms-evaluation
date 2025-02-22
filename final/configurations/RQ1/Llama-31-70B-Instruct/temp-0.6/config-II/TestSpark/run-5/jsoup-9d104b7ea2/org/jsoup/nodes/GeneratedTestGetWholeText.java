package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestGetWholeText {

    private TextNode textNode;
    private final String text = "This is the text";

    @Before
    public void setUp() {
        textNode = new TextNode(text);
    }

    @Test
    public void testGetWholeText() {
        Assert.assertEquals("This is the text", textNode.getWholeText());
    }

}