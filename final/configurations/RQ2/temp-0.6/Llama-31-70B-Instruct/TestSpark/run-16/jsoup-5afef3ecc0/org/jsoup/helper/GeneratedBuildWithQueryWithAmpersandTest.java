package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildWithQueryWithAmpersandTest {

    @Test
    public void buildWithQueryWithAmpersandTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value&with&ampersand"));
        URL actual = urlBuilder.build();
        assertEquals("http://example.com?key=value%26with%26ampersand", actual.toString());
    }

}