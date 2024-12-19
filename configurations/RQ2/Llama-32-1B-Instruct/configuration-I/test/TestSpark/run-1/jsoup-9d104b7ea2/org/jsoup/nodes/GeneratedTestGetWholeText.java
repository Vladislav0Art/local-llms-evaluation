package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals("Hello World", getNodeWholeText(node).toString());
    }

}