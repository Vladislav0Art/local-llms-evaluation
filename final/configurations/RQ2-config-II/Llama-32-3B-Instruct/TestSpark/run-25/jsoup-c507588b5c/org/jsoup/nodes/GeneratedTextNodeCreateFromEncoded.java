package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;

public class GeneratedTextNodeCreateFromEncoded {

    @Test
    public void textNodeCreateFromEncoded() {
        String encodedText = "UTF-8";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals(encodedText, textNode.text());
    }

}