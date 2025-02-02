package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestJsoupSplitText {

    @Test
    public void testJsoupSplitText() throws Exception {
        Document document = Jsoup.parse("<div>Hello <span>World</span></div>");
        TextNode textNode = new TextNode(document, "Hello", 0);
        assertEquals("Hello World", textNode.value());

        String clonedTextNodeValue = textNode.splitText(10).value();
        assertEquals("Hello", clonedTextNodeValue);

        assertTrue(textNode.isBlank());
    }

}