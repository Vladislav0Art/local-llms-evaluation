package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Appender;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.util.StringUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedTestNormalizeWhitespace {

    @Test
    public void testNormalizeWhitespace() throws IOException {
        Function<String, String> func = normalizeWhitespace((s) -> s.trim());
        String text = "   Hello   World!";
        assertEquals("Hello World!", func.apply(text));
    }

}