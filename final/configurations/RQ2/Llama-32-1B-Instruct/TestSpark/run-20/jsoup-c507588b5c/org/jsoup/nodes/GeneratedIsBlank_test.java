package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedIsBlank_test {

    @Test
    public void isBlank_test() {
        TextNode node = new TextNode("Hello World");
        assertTrue(node.isBlank());
        assertFalse(node.isBlank(null));
        assertFalse(node.isBlank(""));
    }

}