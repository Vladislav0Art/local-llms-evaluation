package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedIsBlank_ReturnsFalseForNonEmptyString {

    @Test
    public void isBlank_ReturnsFalseForNonEmptyString() {
        String text = "Hello";
        assertFalse(TextNode.isBlank());
        assertTrue(TextNode.isBlank(""));
        assertFalse(TextNode.isBlank("   "));
    }

}