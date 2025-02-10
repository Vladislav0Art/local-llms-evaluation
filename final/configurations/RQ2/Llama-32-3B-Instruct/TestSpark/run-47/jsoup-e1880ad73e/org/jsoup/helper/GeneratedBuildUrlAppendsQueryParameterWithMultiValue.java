package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildUrlAppendsQueryParameterWithMultiValue {

    @Test
    public void buildUrlAppendsQueryParameterWithMultiValue() throws MalformedURLException, UnsupportedEncodingException {
        Connection.KeyVal[] kv = {new Connection.KeyVal("key1", "value1"), new Connection.KeyVal("key2", "value2")};
        URL url = new UrlBuilder("http://example.com").appendKeyVal(kv).build();
        assertEquals("http://example.com?key1=value1&key2=value2", url.toString());
    }

}