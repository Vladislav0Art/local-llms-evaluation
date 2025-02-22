package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildWithNullQuery {

    @Test
    public void buildWithNullQuery() {
        try {
            UrlBuilder builder = new UrlBuilder(new URL("http://www.example.com"));
            builder.q = null;
            builder.build();
            fail();
        } catch (NullPointerException e) {
            assertEquals(e.getMessage(), "query");
        }
    }

}