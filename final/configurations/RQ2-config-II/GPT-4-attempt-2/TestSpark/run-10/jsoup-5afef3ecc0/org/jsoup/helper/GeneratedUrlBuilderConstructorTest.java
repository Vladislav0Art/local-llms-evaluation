package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            new UrlBuilder(inputUrl);
        } catch (java.net.MalformedURLException e) {
            Assert.fail();
        }
    }

}