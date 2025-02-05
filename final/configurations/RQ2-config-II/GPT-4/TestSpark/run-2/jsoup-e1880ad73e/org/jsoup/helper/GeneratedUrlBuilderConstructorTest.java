package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.*;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder builder = new UrlBuilder(url);
            Assert.assertNotNull(builder);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}