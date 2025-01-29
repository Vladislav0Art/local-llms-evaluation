package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Arrays;

public class GeneratedTestAppendKeyVal_12 {

    @Test
    public void testAppendKeyVal_12() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value).set(false));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?key=value"), result);
    }

}