package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedBuild_url_is_not_punned {

    @Test
    public void build_url_is_not_punned() throws URISyntaxException {
        URL inputUrl = new URL("http://example.com/áoth?query=value#fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals("http://example.com/%C3%A1oth?query=value#fragment", builder.build().toString());
    }

}