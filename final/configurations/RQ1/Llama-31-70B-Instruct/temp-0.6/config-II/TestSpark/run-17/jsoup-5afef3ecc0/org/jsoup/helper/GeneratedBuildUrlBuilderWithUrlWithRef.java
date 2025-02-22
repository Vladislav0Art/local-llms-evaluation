package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlBuilderWithUrlWithRef {

    @Test
    public void buildUrlBuilderWithUrlWithRef() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com#ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://example.com#ref", builtUrl.toString());
    }

}