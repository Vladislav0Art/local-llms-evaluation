package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Appender;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.util.StringUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() throws IOException {
        Document doc = new Document();
        Appendable accum = doc.newAppendable();
        outerHtmlTail(accum, 0, null);
        assertEquals("Test text", (String) accum.toString());
    }

}