package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilder_buildWithQuery {

    @Test
    public void urlBuilder_buildWithQuery() {
        URL inputUrl = new URL("https://example.com/path");
        String query = "query=value";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(Connection.KeyVal.query, query);
        URL expectedUrl = new URL("https://example.com/path?query=value");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}