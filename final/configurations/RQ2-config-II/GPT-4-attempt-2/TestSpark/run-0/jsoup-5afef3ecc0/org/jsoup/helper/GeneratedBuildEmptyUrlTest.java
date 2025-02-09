package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedBuildEmptyUrlTest {

    @Test
    public void buildEmptyUrlTest() {
        try {
            URL inputUrl = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            URL resultUrl = urlBuilder.build();
            Assert.assertEquals(inputUrl, resultUrl);
        } catch (Exception e) {
            e.printStackTrace();
            assert (false);
        }
    }

}