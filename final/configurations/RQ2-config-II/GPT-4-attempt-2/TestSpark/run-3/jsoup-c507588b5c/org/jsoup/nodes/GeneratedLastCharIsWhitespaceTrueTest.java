package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceTrueTest {

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        Boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("Trailing space "));
        Assert.assertTrue(result);
    }

}