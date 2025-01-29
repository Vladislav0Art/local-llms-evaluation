package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Appender;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.util.StringUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedTestCreateTextNode {

    @Test
    public void testCreateTextNode() {
        TextNode textNode = createTextNode("Test text");
        assertEquals("Test text", textNode.text());
    }

}