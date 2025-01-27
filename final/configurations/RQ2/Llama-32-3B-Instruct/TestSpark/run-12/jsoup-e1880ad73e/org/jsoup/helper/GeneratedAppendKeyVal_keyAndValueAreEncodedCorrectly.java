package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Map;

public class GeneratedAppendKeyVal_keyAndValueAreEncodedCorrectly {

    @Test
    public void appendKeyVal_keyAndValueAreEncodedCorrectly() throws UnsupportedEncodingException {
        String host = "example.com";
        String path = "/path/to/resource";
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL(host));
        assertEquals(URLEncoder.encode("key") + "=" + URLEncoder.encode("value"), (new UrlBuilder(builder.build()).build().toURI().getScheme() + "://" + new UrlBuilder(builder.build()).build().toURI().getPath()));
    }

}