package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Appender;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.util.StringUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    @Test
    public void testCreateTextNode() {
        TextNode textNode = createTextNode("Test text");
        assertEquals("Test text", textNode.text());
    }

    @Test
    public void testNormalizeWhitespace() throws IOException {
        Function<String, String> func = normalizeWhitespace((s) -> s.trim());
        String text = "   Hello   World!";
        assertEquals("Hello World!", func.apply(text));
    }

    @Test
    public void testStripLeadingWhitespace() throws IOException {
        Function<String, String> func = stripLeadingWhitespace((s) -> s.replaceFirst("^\\s+", ""));
        String text = "   Hello   World!";
        assertEquals("Hello World!", func.apply(text));
    }

    @Test
    public void testLastCharIsWhitespace() throws IOException {
        String text = "a";
        assertTrue(lastCharIsWhitespace(new StringBuilder(text)));
        text = "Hello";
        assertFalse(lastCharIsWhitespace(new StringBuilder(text)));
    }

    @Test
    public void testTextNodeText() throws IOException {
        TextNode textNode = createTextNode("Test text");
        assertEquals("Test text", textNode.text());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document doc = new Document();
        Appendable accum = doc.newAppendable();
        outerHtmlHead(accum, 0, null);
        assertEquals("Test text", (String) accum.toString());
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        Document doc = new Document();
        Appendable accum = doc.newAppendable();
        outerHtmlTail(accum, 0, null);
        assertEquals("Test text", (String) accum.toString());
    }

}