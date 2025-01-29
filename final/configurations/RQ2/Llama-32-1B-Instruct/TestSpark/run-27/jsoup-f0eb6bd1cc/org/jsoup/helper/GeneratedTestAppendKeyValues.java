package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestAppendKeyValues {

    private final UrlBuilder urlBuilder = new UrlBuilder("http://example.com/path?a=1&b=2");

    @Test
    public void testAppendKeyValues() {
        String key1 = "key1";
        String value1 = "value1";
        String key2 = "key2";
        String value2 = "value2";

        UrlBuilder builder = new UrlBuilder("http://example.com/path");
        builder.appendKeyValues(key1, value1);
        builder.appendKeyValues(key2, value2);

        String result = builder.build();

        assertEquals("http://example.com/path?key1=value1&key2=value2", result);
    }

}