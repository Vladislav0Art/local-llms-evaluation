package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String normalized = TextNode.normaliseWhitespace(" Hello    World   ");
        Assert.assertEquals("Hello World", normalized);
    }

}