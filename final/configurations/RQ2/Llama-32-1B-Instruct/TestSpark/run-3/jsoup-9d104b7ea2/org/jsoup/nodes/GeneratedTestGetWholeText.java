package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestGetWholeText {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testGetWholeText() throws Exception {
        String expected = "Hello World";
        String actual = node.getWholeText();
        assertEquals(expected, actual);
    }

}