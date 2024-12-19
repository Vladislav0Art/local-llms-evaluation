package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals("Hello World", node.stripLeadingWhitespace().toString());
    }

}