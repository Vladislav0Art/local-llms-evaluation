package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedDecodePartWithValidEncodedString_ReturnsCorrectDecodedString {

    @Test
    public void decodePartWithValidEncodedString_ReturnsCorrectDecodedString() {
        String encoded = "http%3A%2F%2Fexample.com%2Fpath%2Fto/resource";
        assertEquals("http://example.com/path/to/resource", UrlBuilder.decodePart(encoded));
    }

}