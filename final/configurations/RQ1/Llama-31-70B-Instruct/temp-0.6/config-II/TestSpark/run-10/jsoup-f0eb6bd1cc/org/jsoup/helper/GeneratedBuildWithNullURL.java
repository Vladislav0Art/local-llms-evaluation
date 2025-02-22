package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildWithNullURL {

    @Test
    public void buildWithNullURL() {
        try {
            UrlBuilder builder = new UrlBuilder(null);
            builder.build();
            fail();
        } catch (NullPointerException e) {
            assertEquals(e.getMessage(), "url must not be null");
        }
    }

}