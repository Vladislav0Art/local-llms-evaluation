package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

public class GeneratedTestDecodeNonAscii {

    private UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path?query=value#anchor"));

    @Test
    public void testDecodeNonAscii() {
        String encoded = "äöü";
        URL decodedUrl = new URI("https://example.com/path?query=" + URLEncoder.encode(encoded, UTF_8.name()));
        assertEquals(decodedUrl.getScheme(), "https");
        assertEquals(decodedUrl.getHost(), "example.com");
        assertEquals(decodedUrl.getPath(), encoded);
    }

}