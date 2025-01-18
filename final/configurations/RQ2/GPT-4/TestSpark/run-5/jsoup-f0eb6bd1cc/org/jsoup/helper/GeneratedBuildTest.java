package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection.KeyVal;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            URL inputUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            URL result = urlBuilder.build();
            Assert.assertNotNull(result);
            Assert.assertEquals(inputUrl, result);
        } catch (MalformedURLException e) {
            Assert.fail(e.getMessage());
        }
    }

}