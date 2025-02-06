package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedCreateFromEncoded TextNodecreateFromEncodedTest {

    @Test
    public void createFromEncoded

    TextNodecreateFromEncodedTest() {
        String encodedText = "Hello World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals(encodedText, textNode.getWholeText());
    }

}