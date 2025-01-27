package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyVal_to_url_with_query_params_and_query_params {

    @Test
    public void appendKeyVal_to_url_with_query_params_and_query_params() throws UnsupportedEncodingException {
        URL url = new URL("http://example.com/path/to/resource?existingQuery=value&query1=queryValue&anotherExistingQuery=anotherValue");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        String expectedUrl = "http://example.com/path/to/resource?existingQuery=value&query1=queryValue&anotherExistingQuery=anotherValue&key=value";
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(kv);
        assertEquals(expectedUrl, builder.build());
    }

}