package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildValidInputTest {

    @Test
    public void buildValidInputTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Assert.assertNotNull(urlBuilder);
            URL resultUrl = urlBuilder.build();
            Assert.assertEquals(url, resultUrl);
        } catch (Exception e) {
            Assert.fail();
        }
    }

}