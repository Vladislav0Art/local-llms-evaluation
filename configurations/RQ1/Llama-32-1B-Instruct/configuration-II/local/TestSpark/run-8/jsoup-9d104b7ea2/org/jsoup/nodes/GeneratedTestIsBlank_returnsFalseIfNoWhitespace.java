package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestIsBlank_returnsFalseIfNoWhitespace {

    @Test
    public void testIsBlank_returnsFalseIfNoWhitespace() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
    }

}