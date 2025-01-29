package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import static org.mockito.Mockito.*;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode node = new TextNode("Hello");
        String text = "Hello World";
        assertEquals(text, node.text());

        when(node.text()).thenReturn(text);
    }

}