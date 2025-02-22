package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithMalformedUrl {

    @Test
    public void buildWithMalformedUrl() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
            URL url = urlBuilder.build();
            assertEquals("http://example.com", url.toString());
        } catch (MalformedURLException e) {
            // ignore
        }
    }

}