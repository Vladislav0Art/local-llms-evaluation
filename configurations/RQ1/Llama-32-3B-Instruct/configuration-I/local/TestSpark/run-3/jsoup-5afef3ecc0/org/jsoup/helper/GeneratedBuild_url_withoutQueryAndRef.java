package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Map;

public class GeneratedBuild_url_withoutQueryAndRef {

    @Test
    public void build_url_withoutQueryAndRef() {
        URL inputUrl = new URL("https://example.com/path");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, builder.build());
    }

}