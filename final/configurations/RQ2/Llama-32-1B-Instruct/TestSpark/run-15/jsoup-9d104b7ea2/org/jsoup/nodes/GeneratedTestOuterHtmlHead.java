package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTestOuterHtmlHead {

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testOuterHtmlHead() {
        TextNode node = createTextNode("Hello, World!");
        String html = node.outerHtml();
        assertNotNull(html);
    }

}