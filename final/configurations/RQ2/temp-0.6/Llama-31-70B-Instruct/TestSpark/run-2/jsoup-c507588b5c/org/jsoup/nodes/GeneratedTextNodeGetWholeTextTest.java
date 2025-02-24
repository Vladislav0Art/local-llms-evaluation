package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;

import java.io.IOException;

public class GeneratedTextNodeGetWholeTextTest {

    @Test
    public void textNodeGetWholeTextTest() {
        TextNode textNode = new TextNode("This is a test");
        assertEquals("This is a test", textNode.getWholeText());
    }

}