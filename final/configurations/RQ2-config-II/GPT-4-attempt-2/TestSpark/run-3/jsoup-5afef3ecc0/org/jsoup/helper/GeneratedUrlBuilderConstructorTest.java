package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() {
        try {
            URL url = new URL("http://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);

            Assert.assertNotNull(urlBuilder);
        } catch (MalformedURLException e) {
            Assert.fail("No exception should be thrown!");
        }
    }

}