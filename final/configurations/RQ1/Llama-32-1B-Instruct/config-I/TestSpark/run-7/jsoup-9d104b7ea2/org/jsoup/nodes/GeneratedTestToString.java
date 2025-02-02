package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello World");
        String expected = "<p>Hello <span>World</span></p>";
        Assert.assertEquals(expected, node.toString());
    }

}