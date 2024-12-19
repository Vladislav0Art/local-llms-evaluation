package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedBuild_url {

    @Test
    public void build_url() {
        String inputUrl = "https://example.com/path";
        URL url = new UrlBuilder(inputUrl).build();
        URI uri = new URI(url.toString());
        assertNotNull(uri);
        assertEquals("https", uri.getScheme());
        assertEquals("example.com/path", uri.getPath());
        assertEquals("/", uri.getRef());
    }

}