package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Map;

public class GeneratedAppendKeyVal_appendNullCorrectly {

    @Test
    public void appendKeyVal_appendNullCorrectly() throws UnsupportedEncodingException, URISyntaxException {
        String host = "example.com";
        String path = "/path/to/resource";
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("key", null);
        UrlBuilder builder = new UrlBuilder(new URL(host));
        assertEquals(host + path, (new UrlBuilder(builder.build()).build().toURI().getScheme() + "://" + new UrlBuilder(builder.build()).build().toURI().getPath()));
    }

}