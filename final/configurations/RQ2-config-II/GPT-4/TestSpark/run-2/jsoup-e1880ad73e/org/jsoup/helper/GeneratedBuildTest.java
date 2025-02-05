package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder builder = new UrlBuilder(url);
            URL resultUrl = builder.build();
            Assert.assertEquals(url, resultUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}