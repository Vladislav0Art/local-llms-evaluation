package org.jsoup.nodes;

import org.jsoup.helper.Validate;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCreateFromEncoded_NullString_ThrowsNullPointerException {

    @Test
    public void createFromEncoded_NullString_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> TextNode.createFromEncoded(null));
    }

    static class StringUtil {
        public static String stripLeadingWhitespace(String text) {
            return text.replaceAll("^\\s+", "");
        }
    }

}