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

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            URL url1 = new URL("https://www.google.com/");
            UrlBuilder urlBuilder = new UrlBuilder(url1);
            URL url2 = urlBuilder.build();
            assertEquals(url1, url2);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}