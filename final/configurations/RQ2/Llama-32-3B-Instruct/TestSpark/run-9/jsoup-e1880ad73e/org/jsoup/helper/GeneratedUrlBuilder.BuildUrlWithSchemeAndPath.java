package org.jsoup.helper;

import org.jsoup.helper.URL;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

public class GeneratedUrlBuilder.

BuildUrlWithSchemeAndPath {

    @Test
    public void urlBuilder.BuildUrlWithSchemeAndPath() {
        String scheme = "https";
        String path = "/path/to/resource";
        assertEquals(scheme + ":" + path, new UrlBuilder(new URL(scheme + "://example.com" + path)).build().getScheme() + "://" + new URL(scheme + "://example.com" + path).getPath());
    }

}