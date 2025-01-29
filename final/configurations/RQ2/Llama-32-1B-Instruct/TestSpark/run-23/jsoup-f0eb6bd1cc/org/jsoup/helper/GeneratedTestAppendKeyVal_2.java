package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Arrays;

public class GeneratedTestAppendKeyVal_2 {

    @Test
    public void testAppendKeyVal_2() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path?param=value");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?key=value&param=value"), result);
    }

}