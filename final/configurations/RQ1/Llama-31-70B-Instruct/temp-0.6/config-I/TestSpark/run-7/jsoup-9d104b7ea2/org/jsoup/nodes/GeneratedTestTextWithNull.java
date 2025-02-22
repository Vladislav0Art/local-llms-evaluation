package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestTextWithNull {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Test");
    }

    @Test
    public void testTextWithNull() {
        textNode.text(null);
        assertEquals("", textNode.text());
    }

}