package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;

import java.io.IOException;

public class GeneratedTextNodeNodeNameTest {

    @Test
    public void textNodeNodeNameTest() {
        TextNode textNode = new TextNode("This is a test");
        assertEquals("#text", textNode.nodeName());
    }

}