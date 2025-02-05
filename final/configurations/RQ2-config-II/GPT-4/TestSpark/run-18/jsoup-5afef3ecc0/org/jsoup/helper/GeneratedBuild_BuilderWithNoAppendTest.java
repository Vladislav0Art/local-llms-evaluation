package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuild_BuilderWithNoAppendTest {

    @Test
    public void build_BuilderWithNoAppendTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Assert.assertEquals(url, urlBuilder.build());
        } catch (MalformedURLException e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

}