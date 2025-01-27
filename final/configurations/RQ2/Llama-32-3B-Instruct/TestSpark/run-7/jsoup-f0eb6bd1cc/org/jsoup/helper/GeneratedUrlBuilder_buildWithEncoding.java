package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilder_buildWithEncoding {

    @Test
    public void urlBuilder_buildWithEncoding() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://example.com/path");
        String query = "query=value&encoding=utf-8";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(Connection.KeyVal.query, query);
        URL expectedUrl = new URL("https://example.com/path?query=value%3Fencoding=utf-8");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}