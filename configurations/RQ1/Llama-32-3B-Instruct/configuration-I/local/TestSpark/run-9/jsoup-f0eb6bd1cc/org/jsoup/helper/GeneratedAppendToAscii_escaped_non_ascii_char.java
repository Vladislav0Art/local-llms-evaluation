package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedAppendToAscii_escaped_non_ascii_char {

    @Test
    public void appendToAscii_escaped_non_ascii_char() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("%C3%A1oth", false, sb);
        assertEquals("%A0th", sb.toString());
    }

}