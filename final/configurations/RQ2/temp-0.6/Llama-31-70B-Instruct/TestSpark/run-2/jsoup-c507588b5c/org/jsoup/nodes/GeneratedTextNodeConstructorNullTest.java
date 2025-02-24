package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;

import java.io.IOException;

public class GeneratedTextNodeConstructorNullTest {

    @Test
    public void textNodeConstructorNullTest() {
        TextNode textNode = new TextNode(null);
        assertNotNull(textNode);
        assertEquals("", textNode.text());
    }

}