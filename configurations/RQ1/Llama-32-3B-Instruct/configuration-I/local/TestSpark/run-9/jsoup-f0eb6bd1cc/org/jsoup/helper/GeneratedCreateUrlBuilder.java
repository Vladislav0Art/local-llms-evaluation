package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedCreateUrlBuilder {

    @Test
    public void createUrlBuilder() {
        URL inputUrl = new URL("https://example.com/path?query=value#fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder.u);
        assertNull(builder.q);
    }

}