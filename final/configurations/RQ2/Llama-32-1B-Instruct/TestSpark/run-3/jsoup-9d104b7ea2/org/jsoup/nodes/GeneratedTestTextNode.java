package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestTextNode {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testTextNode() throws Exception {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
    }

}