package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedOuterHtmlHead_test {

    @Test
    public void outerHtmlHead_test() {
        TextNode node = new TextNode("Hello World");
        assertTrue(node.outerHtmlHead(new Appendable(), 0, null).trim().contains("Hello"));
        assertFalse(node.outerHtmlHead(null, 0, null).trim().contains("Hello"));
    }

}