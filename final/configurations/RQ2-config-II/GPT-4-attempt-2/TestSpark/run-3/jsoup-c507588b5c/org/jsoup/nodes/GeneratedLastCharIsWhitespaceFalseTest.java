package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceFalseTest {

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        Boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("No trailing space"));
        Assert.assertFalse(result);
    }

}