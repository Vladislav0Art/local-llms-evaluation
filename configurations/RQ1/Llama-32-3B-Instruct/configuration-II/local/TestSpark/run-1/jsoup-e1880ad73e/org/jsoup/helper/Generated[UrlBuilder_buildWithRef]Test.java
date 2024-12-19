package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class Generated[UrlBuilder_buildWithRef]

Test {

    @Test
    public void [UrlBuilder_buildWithRef]Test() {
        String url = "http://example.com/path?query=value#anchor";
        String expectedNormUrl = "http://example.com/path?query=value#anchor";
        URL expectedU = new URL(expectedNormUrl);
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedU, builder.u);
    }

}