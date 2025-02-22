package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendToAscii_withSpace {

    @Test
    public void appendToAscii_withSpace() throws UnsupportedEncodingException {
        String input = "a bc";
        StringBuilder sb = new StringBuilder();

        UrlBuilder.appendToAscii(input, false, sb);

        assertEquals("a%20bc", sb.toString());
    }

}