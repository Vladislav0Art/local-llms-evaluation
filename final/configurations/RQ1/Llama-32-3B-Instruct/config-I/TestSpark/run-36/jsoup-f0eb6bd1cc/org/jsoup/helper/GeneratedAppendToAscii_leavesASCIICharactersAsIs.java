package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

public class GeneratedAppendToAscii_leavesASCIICharactersAsIs {

    @Test
    public void appendToAscii_leavesASCIICharactersAsIs() {
        String path = "path with only ascii characters";
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii(path, false, sb);
        assertEquals("path with only ascii characters", sb.toString());
    }

}