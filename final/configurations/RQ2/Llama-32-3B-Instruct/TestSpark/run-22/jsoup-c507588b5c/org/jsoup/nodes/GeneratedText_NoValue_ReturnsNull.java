package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;

public class GeneratedText_NoValue_ReturnsNull {

    @Test
    public void text_NoValue_ReturnsNull() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

}