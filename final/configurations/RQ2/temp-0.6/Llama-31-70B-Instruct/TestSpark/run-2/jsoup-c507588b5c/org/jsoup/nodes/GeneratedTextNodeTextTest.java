package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;

import java.io.IOException;

public class GeneratedTextNodeTextTest {

    @Test
    public void textNodeTextTest() {
        TextNode textNode = new TextNode("This is a test");
        assertEquals("This is a test", textNode.text());
    }

}