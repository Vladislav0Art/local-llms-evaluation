package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedCreateFromEncoded_test {

    @Test
    public void createFromEncoded_test() {
        String encodedText = "Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals("Hello World", node.text());
    }

}