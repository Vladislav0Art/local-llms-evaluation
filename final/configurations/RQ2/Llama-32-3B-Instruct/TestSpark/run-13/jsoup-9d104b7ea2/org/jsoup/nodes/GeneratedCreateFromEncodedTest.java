package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() throws IOException {
        String encodedText = "<p>Hello World</p>";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertTrue(isNotEmpty(node.text()));
    }

}