package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import static org.mockito.Mockito.*;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello");
        String expected = "TextNode(node=Hello)";
        assertEquals(expected, node.toString());

        when(node.toString()).thenReturn(expected);
    }

}