package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document document = newDocument();
        TextNode text = new TextNode("<a href='#'>Hello</a>");
        Appendable output = document.outerHtml();

        outerHtmlHead(output, 0, document);

        assertEquals("Hello", output.toString());

        TextNode text2 = new TextNode("");
        append(output, text2);

        assertTrue(text2.isBlank());
    }

}