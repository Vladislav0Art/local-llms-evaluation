package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedUrlBuilderTest {

    @Test
    public void UrlBuilderTest() {
        try {
            URL url = new URL("https://www.google.com/");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            assertNotNull(urlBuilder);
            assertEquals(url, urlBuilder.u);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}