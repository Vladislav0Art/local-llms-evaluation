package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        String text = "   Hello   World  ";
        TextNode node = new TextNode(text);
        assertEquals("  HelloWorld  ", node.stripLeadingWhitespace().toString());
    }

}