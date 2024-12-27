package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;

public class GeneratedTextTest {

    @Test
    public void TextTest() {
        TextNode node = new TextNode("hello world");
        node.text("new text");
        Assert.assertEquals("new text", node.text());
    }

}