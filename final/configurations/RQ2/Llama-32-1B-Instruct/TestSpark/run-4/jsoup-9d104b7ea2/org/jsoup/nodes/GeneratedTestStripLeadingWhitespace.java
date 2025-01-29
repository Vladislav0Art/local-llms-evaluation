package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() {
        String text = "   Hello   World  ";
        StringBuilder sb = new StringBuilder();
        stripLeadingWhitespace(sb, text);
        assertEquals("Hello World", sb.toString());
    }

}