package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestSplitText {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testSplitText() throws Exception {
        TextNode textNode = new TextNode("Hello World");
        String expected = "Hello   World";
        assertEquals(expected, textNode.splitText(0));
    }

}