package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedUrlBuilder_ConstructorTest {

    @Test
    public void UrlBuilder_ConstructorTest() {
        URL url = null;
        try {
            url = new URL("https://example.com");
        } catch (MalformedURLException mue) {
            Assert.fail(mue.getMessage());
        }
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertNotNull(urlBuilder);
    }

}