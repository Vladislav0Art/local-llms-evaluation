package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedAppendToAscii_escaped_space_as_plus {

    @Test
    public void appendToAscii_escaped_space_as_plus() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("áóth ", true, sb);
        assertTrue(sb.toString().contains("+"));
    }

}