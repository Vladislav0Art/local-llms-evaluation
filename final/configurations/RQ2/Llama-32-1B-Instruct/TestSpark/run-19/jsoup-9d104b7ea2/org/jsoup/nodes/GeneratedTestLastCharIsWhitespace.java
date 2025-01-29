package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Appender;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.util.StringUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedTestLastCharIsWhitespace {

    @Test
    public void testLastCharIsWhitespace() throws IOException {
        String text = "a";
        assertTrue(lastCharIsWhitespace(new StringBuilder(text)));
        text = "Hello";
        assertFalse(lastCharIsWhitespace(new StringBuilder(text)));
    }

}