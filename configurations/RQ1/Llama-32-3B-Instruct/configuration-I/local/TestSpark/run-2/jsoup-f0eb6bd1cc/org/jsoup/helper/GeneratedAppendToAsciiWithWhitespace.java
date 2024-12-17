package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.jsoup.Connection.KeyVal;

public class GeneratedAppendToAsciiWithWhitespace {

    @Test
    public void appendToAsciiWithWhitespace() throws Exception {
        StringBuilder expectedStringBuilder = new StringBuilder().append("+");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        String s = " ";
        UrlBuilder.appendToAscii(s, true, builder.q);
        assertEquals(expectedStringBuilder.toString(), String.format("%s%s", String.format("%c", (char) 32), builder.q.toString()));
    }

}