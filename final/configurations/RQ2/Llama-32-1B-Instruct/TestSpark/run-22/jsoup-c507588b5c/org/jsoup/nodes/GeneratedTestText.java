package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode node = new TextNode("Hello");
        assertEquals(String.class, node.getText().getClass());
    }

}