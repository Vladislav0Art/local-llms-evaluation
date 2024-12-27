package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void NormaliseWhitespaceTest() {
        String result = TextNode.normaliseWhitespace("hello  world");
        Assert.assertEquals("hello world", result);
    }

}