package org.jsoup.helper;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildUrlFromValidUrlTest {

    @Test
    public void buildUrlFromValidUrlTest() {
        URL url = new URL("https://example.com/path?query=value#ref");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder.build());
    }

}