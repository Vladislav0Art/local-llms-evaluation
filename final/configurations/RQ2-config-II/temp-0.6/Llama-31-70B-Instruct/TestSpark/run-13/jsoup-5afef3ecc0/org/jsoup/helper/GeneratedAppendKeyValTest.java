package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendKeyValTest {

    private static final String TEST_URL = "http://example.com/";

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "val");
        UrlBuilder urlBuilder = new UrlBuilder(new URL(TEST_URL));
        urlBuilder.appendKeyVal(kv);

        assertEquals(kv.key(), "key");
        assertEquals(kv.val(), "val");
    }

}