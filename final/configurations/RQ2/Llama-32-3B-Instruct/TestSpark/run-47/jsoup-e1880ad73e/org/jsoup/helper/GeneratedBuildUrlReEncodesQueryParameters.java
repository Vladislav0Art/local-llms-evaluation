package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildUrlReEncodesQueryParameters {

    @Test
    public void buildUrlReEncodesQueryParameters() throws MalformedURLException {
        String reEncodedQuery = "key=value";
        Connection.KeyVal kv = new Connection.KeyVal("key", reEncodedQuery);
        URL url = new UrlBuilder("http://example.com").appendKeyVal(kv).build();
        assertEquals("http://example.com?key=" + URLEncoder.encode(reEncodedQuery, DataUtil.UTF_8), url.toString());
    }

}