package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildUrlAppendsQueryParameterWithNullValue {

    @Test
    public void buildUrlAppendsQueryParameterWithNullValue() throws MalformedURLException, UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        URL url = new UrlBuilder("http://example.com").appendKeyVal(kv).build();
        assertEquals("http://example.com?key=", url.toString());
    }

}