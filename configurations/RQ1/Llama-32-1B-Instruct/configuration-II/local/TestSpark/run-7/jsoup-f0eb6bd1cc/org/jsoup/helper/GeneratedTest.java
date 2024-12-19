package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

public class GeneratedTest {

    private UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path?query=value#anchor"));

    @Test
    public void testNormalizeUrl() {
        URL normalizedUrl = urlBuilder.build();
        assertEquals("https://example.com/path?query=value#anchor", normalizedUrl.toString());
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder.UrlBuilderBuilder builder = UrlBuilder.newUrlBuilderBuilder();
        builder.appendKeyVal(new UrlBuilder.KeyVal(key, value));
        assertEquals("key=value", builder.toString());
        builder = UrlBuilder.newUrlBuilderBuilder().appendKeyVal(null);
        assertEquals("value", builder.toString());
    }

    @Test
    public void testEncodeNonAscii() throws UnsupportedEncodingException {
        String encoded = "äöü";
        URL url = new URI("https://example.com/path?query=" + URLEncoder.encode(encoded, UTF_8.name()));
        assertNotNull(url);
        assertEquals("https://example.com/path?query=äöü", url.toString());
    }

    @Test
    public void testDecodeNonAscii() {
        String encoded = "äöü";
        URL decodedUrl = new URI("https://example.com/path?query=" + URLEncoder.encode(encoded, UTF_8.name()));
        assertEquals(decodedUrl.getScheme(), "https");
        assertEquals(decodedUrl.getHost(), "example.com");
        assertEquals(decodedUrl.getPath(), encoded);
    }

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