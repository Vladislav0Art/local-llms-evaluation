package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlBuilderWithUrlWithInvalidQuery {

    @Test
    public void buildUrlBuilderWithUrlWithInvalidQuery() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com?invalid");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://example.com?invalid", builtUrl.toString());
    }

}