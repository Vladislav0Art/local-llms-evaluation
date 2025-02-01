package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.UnsupportedEncodingException;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void urlBuilderConstructorTest() {
        try {
            new UrlBuilder(new URL("http://localhost"));
        } catch (MalformedURLException e) {
            Assert.fail("UrlBuilder constructor test failed");
        }
    }

}