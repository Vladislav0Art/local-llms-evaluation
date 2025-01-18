package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() throws IOException {
        String result = TextNode.normaliseWhitespace("No   whitespace");
        Assert.assertEquals("No whitespace", result);
    }

}