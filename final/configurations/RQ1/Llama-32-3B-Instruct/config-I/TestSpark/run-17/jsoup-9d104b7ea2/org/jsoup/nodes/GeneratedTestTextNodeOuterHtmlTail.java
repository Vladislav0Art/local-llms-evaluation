package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextNodeOuterHtmlTail {

    @Test
    public void testTextNodeOuterHtmlTail() throws IOException {
        Document document = Jsoup.parse("<p>Hello World!</p>");
        Element parentNode = document.body().children().get(0);
        TextNode textNode = (TextNode) child;
        assertEquals("Hello World", StringUtil.normaliseWhitespace(textNode.text()));
    }

}