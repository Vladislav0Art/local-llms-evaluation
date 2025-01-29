package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() throws Exception {
        TextNode node = new TextNode("Hello");
        String expected = "Hello";
        verify(node).getWholeText().thenReturn(expected);
        assertSame(expected, node.getWholeText());
    }

}