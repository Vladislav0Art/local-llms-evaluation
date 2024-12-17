package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

public class GeneratedSplitTextMethodCreatesNewTextNodeAtCorrectOffsetTest {

    @Test
    public void splitTextMethodCreatesNewTextNodeAtCorrectOffsetTest() throws IOException {
        Document document = new Document("<html>Hello World\nThis is a test</html>");
        Appendable accum = new StringBuilder();
        int offset = 7;
        TextNode originalTextNode = textNodeFromHtml(document, "html");
        TextNode textNode = originalTextNode.splitText(offset);
        assertEquals("Hello World", textNode.text());
        assertEquals("\nThis is a test", originalTextNode.text());
    }

}