package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedText_test {

    @Test
    public void text_test() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
        assertEquals("", node.text(null));
        assertEquals("World", node.text(new String[]{}));
    }

}