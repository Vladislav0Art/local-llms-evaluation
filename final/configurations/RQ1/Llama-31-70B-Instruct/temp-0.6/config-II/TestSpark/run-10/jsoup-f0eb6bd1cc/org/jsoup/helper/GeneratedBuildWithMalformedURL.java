package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildWithMalformedURL {

    @Test
    public void buildWithMalformedURL() {
        try {
            UrlBuilder builder = new UrlBuilder(new URL("http://www.example.com"));
            builder.build();
            fail();
        } catch (MalformedURLException e) {
            assertEquals(e.getMessage(), "no protocol: http://www.example.com");
        }
    }

}