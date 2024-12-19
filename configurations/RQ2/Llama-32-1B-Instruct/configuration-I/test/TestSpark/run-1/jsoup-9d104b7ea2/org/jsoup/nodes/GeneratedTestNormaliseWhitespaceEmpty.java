package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestNormaliseWhitespaceEmpty {

    @Test
    public void testNormaliseWhitespaceEmpty() {
        TextNode node = new TextNode("");
        assertEquals("", getNodeString(node));
    }

}