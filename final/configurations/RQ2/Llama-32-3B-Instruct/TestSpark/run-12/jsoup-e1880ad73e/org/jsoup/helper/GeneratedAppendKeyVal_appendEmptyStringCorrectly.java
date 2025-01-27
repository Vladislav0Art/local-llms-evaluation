package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Map;

public class GeneratedAppendKeyVal_appendEmptyStringCorrectly {

    @Test
    public void appendKeyVal_appendEmptyStringCorrectly() throws UnsupportedEncodingException, URISyntaxException {
        String host = "example.com";
        String path = "/path/to/resource";
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("key", "");
        UrlBuilder builder = new UrlBuilder(new URL(host));
        builder.appendKeyVal(kv);
        assertEquals(host + path, (new UrlBuilder(builder.build()).build().toURI().getScheme() + "://" + new UrlBuilder(builder.build()).build().toURI().getPath()));
    }

}