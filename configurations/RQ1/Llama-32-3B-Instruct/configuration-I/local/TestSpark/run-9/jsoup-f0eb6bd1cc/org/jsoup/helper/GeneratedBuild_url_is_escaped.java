package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedBuild_url_is_escaped {

    @Test
    public void build_url_is_escaped() throws URISyntaxException {
        URL inputUrl = new URL("https://example.com/path?query=%3Fvalue%3D&%23fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals("https://example.com/path?query=%3Fvalue=%3D&%23fragment", builder.build().toString());
    }

}