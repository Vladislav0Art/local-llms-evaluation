package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendToAscii_[NonASCIICharacter]

Test {

    @Test
    public void appendToAscii_[ NonASCIICharacter]Test() throws UnsupportedEncodingException {
        String nonASCIICharacter = "\u00E9\u00F5\u0308"; // eumma with U+0308 (comb above)
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii(sb, false, null);
        assertTrue(sb.toString().contains("%E9%EF%F8"));
    }

}