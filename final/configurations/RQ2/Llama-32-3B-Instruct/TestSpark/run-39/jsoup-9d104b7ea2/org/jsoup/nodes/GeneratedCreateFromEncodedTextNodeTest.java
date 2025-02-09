package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateFromEncodedTextNodeTest {

    @Test
    public void createFromEncodedTextNodeTest() throws IOException {
        String encodedText = "Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node.text());
        assertEquals(encodedText, node.text());
    }

}