package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

public class GeneratedAppendToAscii_appendsEncodedPathWhenNonASCIICharactersArePresent {

    @Test
    public void appendToAscii_appendsEncodedPathWhenNonASCIICharactersArePresent() {
        String path = "path with non-ascii characters";
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii(path, false, sb);
        assertEquals("%C3%A5path with non-ascii characters", sb.toString());
    }

}