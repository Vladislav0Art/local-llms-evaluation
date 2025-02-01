package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildWithQueryParamTest {

    @Test
    public void buildWithQueryParamTest() throws Exception {
        URL url = new URL("http://example.com?param=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL expectedUrl = new URL("http://example.com?param=value");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}