package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildWithQueryTest {

    @Test
    public void buildWithQueryTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL actual = urlBuilder.build();
        assertEquals("http://example.com?key=value", actual.toString());
    }

}