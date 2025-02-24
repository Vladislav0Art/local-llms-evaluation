package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildWithQueryWithPlusTest {

    @Test
    public void buildWithQueryWithPlusTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value+with+plus"));
        URL actual = urlBuilder.build();
        assertEquals("http://example.com?key=value%2Bwith%2Bplus", actual.toString());
    }

}