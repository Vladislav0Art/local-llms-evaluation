package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendToAscii {

    @Test
    public void appendToAscii() throws UnsupportedEncodingException {
        String input = "abc";
        StringBuilder sb = new StringBuilder();

        UrlBuilder.appendToAscii(input, false, sb);

        assertEquals("abc", sb.toString());
    }

}