package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Map;

public class GeneratedBuild_url_withQueryAndNoRef {

    @Test
    public void build_url_withQueryAndNoRef() {
        URL inputUrl = new URL("https://example.com/path?a=1&b=2#ref");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, builder.build());
    }

}