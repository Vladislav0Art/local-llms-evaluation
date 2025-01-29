package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedGetWholeText_test {

    @Test
    public void getWholeText_test() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.getWholeText());
        assertEquals(null, node.getWholeText(""));
        assertEquals(0, node.getWholeText("").length());
    }

}