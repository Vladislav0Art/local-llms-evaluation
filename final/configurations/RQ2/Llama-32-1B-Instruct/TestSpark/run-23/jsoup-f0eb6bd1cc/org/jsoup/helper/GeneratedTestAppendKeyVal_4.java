package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Arrays;

public class GeneratedTestAppendKeyVal_4 {

    @Test
    public void testAppendKeyVal_4() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path?param=value");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value).set(1.0));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?param=value"), result);
    }

}