package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedShouldIndent_GivenNode_GeneratesCorrectBoolean {

    @Test
    public void shouldIndent_GivenNode_GeneratesCorrectBoolean() {
        Node node = new MockableTextNode("Hello");
        boolean expected = true;
        boolean actual = NodeUtil.shouldIndent(node);
        assertEquals(expected, actual);
    }

}