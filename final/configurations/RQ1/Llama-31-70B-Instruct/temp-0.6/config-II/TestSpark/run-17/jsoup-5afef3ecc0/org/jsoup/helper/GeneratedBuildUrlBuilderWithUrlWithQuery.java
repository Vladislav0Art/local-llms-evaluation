package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlBuilderWithUrlWithQuery {

    @Test
    public void buildUrlBuilderWithUrlWithQuery() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://example.com?key=value", builtUrl.toString());
    }

}