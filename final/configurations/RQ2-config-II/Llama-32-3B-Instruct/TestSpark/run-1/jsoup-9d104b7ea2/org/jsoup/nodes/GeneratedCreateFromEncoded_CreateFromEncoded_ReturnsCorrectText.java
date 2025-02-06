package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Collections;

public class GeneratedCreateFromEncoded_CreateFromEncoded_ReturnsCorrectText {

    @Test
    public void createFromEncoded_CreateFromEncoded_ReturnsCorrectText() {
        String encodedText = "UTF-8 encoded text";
        TextNode result = TextNode.createFromEncoded(encodedText);
        assertNotNull(result);
        assertEquals(encodedText, result.text());
    }

}