package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedBuildWithValidUrl_ReturnsSameURL {

    @Test
    public void buildWithValidUrl_ReturnsSameURL() {
        URL u = new URL("http://example.com/path/to/resource?query=hello&key=value#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(u);
        assertEquals(u, urlBuilder.build());
    }

}