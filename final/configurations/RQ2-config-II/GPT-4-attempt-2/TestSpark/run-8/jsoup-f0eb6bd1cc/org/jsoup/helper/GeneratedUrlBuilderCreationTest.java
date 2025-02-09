package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertNotNull;

public class GeneratedUrlBuilderCreationTest {

    @Test
    public void urlBuilderCreationTest() {
        URL mockUrl = Mockito.mock(URL.class);
        UrlBuilder urlBuilder = new UrlBuilder(mockUrl);
        assertNotNull(urlBuilder);
    }

}