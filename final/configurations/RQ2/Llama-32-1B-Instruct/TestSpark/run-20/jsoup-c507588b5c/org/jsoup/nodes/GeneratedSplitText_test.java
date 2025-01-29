package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedSplitText_test {

    @Test
    public void splitText_test() {
        TextNode node = new TextNode("Hello World");
        assertEquals(2, node.splitText(0));
        assertEquals(4, node.splitText(-1));
        assertEquals(3, node.splitText(10));
        assertEquals(5, node.splitText(20));
    }

}