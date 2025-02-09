package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL expectedUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(expectedUrl);
        URL actualUrl = urlBuilder.build();
        assertEquals("Built URL should match the expected URL", expectedUrl, actualUrl);
    }

}