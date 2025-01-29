package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedOuterHtmlTail_test {

    @Test
    public void outerHtmlTail_test() {
        TextNode node = new TextNode("Hello World");
        assertTrue(node.outerHtmlTail(new Appendable(), 0, null).trim().isEmpty());
        assertFalse(node.outerHtmlTail(null, 0, null).trim().isEmpty());
    }

}