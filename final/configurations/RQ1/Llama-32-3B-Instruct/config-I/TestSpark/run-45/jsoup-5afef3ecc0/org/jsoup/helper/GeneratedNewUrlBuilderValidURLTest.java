package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNewUrlBuilderValidURLTest {

    @Test
    public void newUrlBuilderValidURLTest() {
        URL url = new URL("https://example.com/path?query=value#ref");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder.u);
    }

}