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

public class GeneratedAppendToAscii {

    @Test
    public void appendToAscii() {
        String s = "test";
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendToAscii(s, false, sb);
        assertEquals(s, sb.toString());
    }

}