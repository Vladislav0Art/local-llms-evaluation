package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

public class GeneratedTestEncodeNonAscii {

    private UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path?query=value#anchor"));

    @Test
    public void testEncodeNonAscii() throws UnsupportedEncodingException {
        String encoded = "äöü";
        URL url = new URI("https://example.com/path?query=" + URLEncoder.encode(encoded, UTF_8.name()));
        assertNotNull(url);
        assertEquals("https://example.com/path?query=äöü", url.toString());
    }

}