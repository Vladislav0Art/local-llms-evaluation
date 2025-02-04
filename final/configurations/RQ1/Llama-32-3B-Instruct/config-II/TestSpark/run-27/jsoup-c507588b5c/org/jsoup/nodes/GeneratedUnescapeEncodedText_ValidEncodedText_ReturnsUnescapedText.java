package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedUnescapeEncodedText_ValidEncodedText_ReturnsUnescapedText {

    @Test
    public void unescapeEncodedText_ValidEncodedText_ReturnsUnescapedText() {
        String encodedText = "&lt;Test&gt;";
        String result = Entities.unescape(encodedText);
        assertEquals("&lt;Test&gt;", result);
    }

}