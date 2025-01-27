package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilder_buildWithFragment {

    @Test
    public void urlBuilder_buildWithFragment() {
        URL inputUrl = new URL("https://example.com/path#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String fragment = "new_fragment";
        urlBuilder.appendKeyVal(Connection.KeyVal.fragment, fragment);
        URL expectedUrl = new URL("https://example.com/path#new_fragment");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}