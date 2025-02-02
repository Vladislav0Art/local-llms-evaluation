package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedText_GivenEncodedText_ReturnsUnencodedText {

    @Test
    public void text_GivenEncodedText_ReturnsUnencodedText() throws IOException {
        String encodedText = "&lt;Hello&gt;, &amp;World!&amp;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        String result = new ByteArrayOutputStream().toString();
        textNode.text(result);
        assertEquals("Hello, World!", StringUtil.normaliseWhitespace(result));
    }

}