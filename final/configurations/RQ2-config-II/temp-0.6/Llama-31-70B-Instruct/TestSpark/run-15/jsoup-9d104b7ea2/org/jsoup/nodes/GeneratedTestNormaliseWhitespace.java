package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTestNormaliseWhitespace {

    private TextNode node;

    @Before
    public void setup() {
        node = new TextNode("test");
    }

    @Test
    public void testNormaliseWhitespace() {
        assertNotNull(TextNode.normaliseWhitespace("test"));
    }

}