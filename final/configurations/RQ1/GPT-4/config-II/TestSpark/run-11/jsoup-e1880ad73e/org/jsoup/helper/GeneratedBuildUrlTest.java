package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlTest {

    @Test
    public void buildUrlTest() throws Exception {
        URL inputUrl = new URL("http://username:password@example.com:8080/path?query#ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        assertEquals("http://username:password@example.com:8080/path?query#ref", resultUrl.toString());
    }

}