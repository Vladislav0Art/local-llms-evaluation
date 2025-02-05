package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() {
        try {
            URL testUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilderTest = new UrlBuilder(testUrl);
            Assert.assertNotNull(urlBuilderTest);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

}