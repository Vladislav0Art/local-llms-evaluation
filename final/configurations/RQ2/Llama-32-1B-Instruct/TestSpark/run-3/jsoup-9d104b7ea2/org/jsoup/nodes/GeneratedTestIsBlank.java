package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestIsBlank {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testIsBlank() throws Exception {
        assertTrue(node.isBlank());
    }

}