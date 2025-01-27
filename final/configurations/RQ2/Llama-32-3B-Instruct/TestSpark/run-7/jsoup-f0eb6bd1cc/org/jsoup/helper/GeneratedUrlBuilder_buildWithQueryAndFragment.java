package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilder_buildWithQueryAndFragment {

    @Test
    public void urlBuilder_buildWithQueryAndFragment() {
        URL inputUrl = new URL("https://example.com/path");
        String query = "query=value";
        String fragment = "fragment";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(Connection.KeyVal.query, query);
        urlBuilder.appendKeyVal(Connection.KeyVal.fragment, fragment);
        URL expectedUrl = new URL("https://example.com/path?query=value#fragment");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}