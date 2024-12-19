package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedLastCharIsWhitespace_GivenStringBuilder_ReturnsBoolean {

    @Test
    public void lastCharIsWhitespace_GivenStringBuilder_ReturnsBoolean() {
        StringBuilder input = new StringBuilder("Hello ");
        assertTrue(NodeUtil.lastCharIsWhitespace(input));
    }
}

}