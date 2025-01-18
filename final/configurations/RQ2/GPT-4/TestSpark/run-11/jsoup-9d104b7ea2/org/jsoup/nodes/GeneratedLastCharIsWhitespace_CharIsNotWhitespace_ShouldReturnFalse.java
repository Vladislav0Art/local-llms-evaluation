package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedLastCharIsWhitespace_CharIsNotWhitespace_ShouldReturnFalse {

    @Test
    public void lastCharIsWhitespace_CharIsNotWhitespace_ShouldReturnFalse() {
        StringBuilder sb = new StringBuilder("NotWhitespace");
        boolean result = TextNode.lastCharIsWhitespace(sb);
        Assert.assertFalse(result);
    }

}