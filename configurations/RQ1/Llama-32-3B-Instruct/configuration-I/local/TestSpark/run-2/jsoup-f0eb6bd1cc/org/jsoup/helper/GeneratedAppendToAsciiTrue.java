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

public class GeneratedAppendToAsciiTrue {

    @Test
    public void appendToAsciiTrue() {
        String s = "test";
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendToAscii(s, true, sb);
        assertEquals(s, sb.toString());
    }
}

public class UrlBuilder {

    private URL url;

    public UrlBuilder(URL url) {
        this.url = url;
    }

    public void appendToAscii(String s, boolean escapeChar, StringBuilder sb) {
        if (escapeChar) {
            // implement escaping logic
        } else {
            sb.append(s);
        }
    }

    public String toString() {
        return url.toString();
    }
}

public class KeyVal {

    private int code;

    public KeyVal(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return Integer.toString(code);
    }

}