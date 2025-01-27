package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyVal_to_url_with_multiple_fragments {

    @Test
    public void appendKeyVal_to_url_with_multiple_fragments() throws UnsupportedEncodingException {
        URL url = new URL("http://example.com/path/to/resource#fragment1&key=value#fragment2");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        String expectedUrl = "http://example.com/path/to/resource?existingQuery=value&key=value#fragment1&key=value#fragment2";
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(kv);
        assertEquals(expectedUrl, builder.build());
    }

}