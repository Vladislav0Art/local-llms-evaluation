package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            URL url = new URL("http://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);

            URL result = urlBuilder.build();

            Assert.assertNotNull(result);
            Assert.assertEquals("http://www.example.com", result.toString());
        } catch (MalformedURLException e) {
            Assert.fail("No exception should be thrown!");
        }
    }

}