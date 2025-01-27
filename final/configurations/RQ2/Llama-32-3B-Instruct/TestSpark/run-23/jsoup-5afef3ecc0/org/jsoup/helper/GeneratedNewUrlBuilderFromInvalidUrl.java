package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class GeneratedNewUrlBuilderFromInvalidUrl {

    @Test
    public void newUrlBuilderFromInvalidUrl() {
        String invalidUrl = "invalid://";
        UrlBuilder builder = new UrlBuilder(invalidUrl);
        try {
            URL url = builder.build();
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
        }
    }

}