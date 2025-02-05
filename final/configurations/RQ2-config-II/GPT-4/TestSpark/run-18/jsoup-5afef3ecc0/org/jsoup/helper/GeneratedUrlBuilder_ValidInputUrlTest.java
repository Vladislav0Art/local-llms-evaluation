package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedUrlBuilder_ValidInputUrlTest {

    @Test
    public void UrlBuilder_ValidInputUrlTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Assert.assertEquals(url, urlBuilder.build());
        } catch (MalformedURLException e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

}