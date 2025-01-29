package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Arrays;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        URLBuilder builder = new UrlBuilder("https://example.com/path?param=value");
        URI result = builder.build();
        assertEquals(URI.create("https://example.com/path?param=value"), result);
    }

}