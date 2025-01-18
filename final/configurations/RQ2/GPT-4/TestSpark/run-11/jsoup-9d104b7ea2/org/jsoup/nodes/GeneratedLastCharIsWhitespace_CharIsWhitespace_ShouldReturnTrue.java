package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedLastCharIsWhitespace_CharIsWhitespace_ShouldReturnTrue {

    @Test
    public void lastCharIsWhitespace_CharIsWhitespace_ShouldReturnTrue() {
        StringBuilder sb = new StringBuilder(" ");
        boolean result = TextNode.lastCharIsWhitespace(sb);
        Assert.assertTrue(result);
    }

}