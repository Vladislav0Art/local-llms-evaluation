package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertNotNull(node.getWholeText());
        assertEquals("test", node.getWholeText());
    }

}