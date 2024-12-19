package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestText {

    @Test
    public void testText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals(text, getNodeText(node));
        assertEquals("", getNodeWholeText(node).toString());
        assertEquals(10, getNodeIsBlank(node).length());
        assertNotNull(getSplitText(0, node));
    }

}