package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildValidUrlTest {

    @Test
    public void buildValidUrlTest() {
        try {
            URL validUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(validUrl);
            Assert.assertEquals(validUrl, urlBuilder.build());
        } catch (MalformedURLException e) {
            fail("Test failed due to MalformedURLException");
        }
    }

}