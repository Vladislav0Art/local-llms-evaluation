package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedUrlBuilderConstructorNormalURLTest {

    @Test
    public void UrlBuilderConstructorNormalURLTest() {
        try {
            URL inputUrl = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Assert.assertNotNull(urlBuilder);
        } catch (Exception e) {
            e.printStackTrace();
            assert (false);
        }
    }

}