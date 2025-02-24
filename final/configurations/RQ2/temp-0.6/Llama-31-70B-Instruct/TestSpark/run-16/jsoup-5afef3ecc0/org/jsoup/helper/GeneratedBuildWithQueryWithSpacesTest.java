package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildWithQueryWithSpacesTest {

    @Test
    public void buildWithQueryWithSpacesTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value with spaces"));
        URL actual = urlBuilder.build();
        assertEquals("http://example.com?key=value+with+spaces", actual.toString());
    }

}