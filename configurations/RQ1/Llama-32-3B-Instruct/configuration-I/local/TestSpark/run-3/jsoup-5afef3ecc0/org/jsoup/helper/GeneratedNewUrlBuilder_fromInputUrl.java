package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Map;

public class GeneratedNewUrlBuilder_fromInputUrl {

    @Test
    public void newUrlBuilder_fromInputUrl() {
        URL inputUrl = new URL("https://example.com/path?a=1&b=2#ref");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder.u);
    }

}