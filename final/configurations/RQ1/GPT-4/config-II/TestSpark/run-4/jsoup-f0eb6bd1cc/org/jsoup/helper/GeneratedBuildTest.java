package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.UnsupportedEncodingException;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://localhost"));
            URL url = urlBuilder.build();
            Assert.assertEquals("http://localhost", url.toString());
        } catch (MalformedURLException e) {
            Assert.fail("Build test failed");
        }
    }

}