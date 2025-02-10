package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildUrlDecodesQueryParameters {

    @Test
    public void buildUrlDecodesQueryParameters() throws MalformedURLException, UnsupportedEncodingException {
        String decodedQuery = "key=value";
        Connection.KeyVal kv = new Connection.KeyVal("key", decodedQuery);
        URL url = new UrlBuilder("http://example.com").appendKeyVal(kv).build();
        assertEquals("http://example.com?key=" + URLDecoder.decode(decodedQuery, DataUtil.UTF_8), url.toString());
    }

}