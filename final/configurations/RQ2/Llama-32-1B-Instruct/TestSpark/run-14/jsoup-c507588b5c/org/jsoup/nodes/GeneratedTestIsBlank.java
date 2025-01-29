package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import static org.mockito.Mockito.*;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());

        when(node.isBlank()).thenReturn(true);

        assertFalse(node.isBlank());
    }

}