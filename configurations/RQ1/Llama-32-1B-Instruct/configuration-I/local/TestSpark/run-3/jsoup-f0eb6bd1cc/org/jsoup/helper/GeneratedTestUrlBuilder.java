package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() throws UnsupportedEncodingException, MalformedURLException {
        URL url = new URL("http://example.com/path?query=value#fragment");
        UrlBuilder builder = new UrlBuilder(url);
        String normUrl = builder.build().toString();
        assertNotNull(normUrl);
        assertNotSame(url, normUrl);
    }

}