package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

public class GeneratedTestAppendToAscii {

    private UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path?query=value#anchor"));

    @Test
    public void testAppendToAscii() {
        String s = "äöü";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int c = s.codePointAt(i);
            if (c == ' ') {
                sb.append(" ");
            } else if (c > 127) { // out of ascii range
                sb.append(URLEncoder.encode(new String(Character.toChars(c)), UTF_8.name()));
            } else {
                sb.append((char) c);
            }
        }
        URL url = new URI("https://example.com/path?query=value#anchor");
        assertEquals("äöü ", url.getQuery().toString());
    }

}