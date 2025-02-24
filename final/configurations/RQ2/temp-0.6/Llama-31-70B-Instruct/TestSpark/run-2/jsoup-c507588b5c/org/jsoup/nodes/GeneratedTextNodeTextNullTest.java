package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;

import java.io.IOException;

public class GeneratedTextNodeTextNullTest {

    @Test
    public void textNodeTextNullTest() {
        TextNode textNode = new TextNode("This is a test");
        textNode.text(null);
        assertEquals("", textNode.text());
    }

}