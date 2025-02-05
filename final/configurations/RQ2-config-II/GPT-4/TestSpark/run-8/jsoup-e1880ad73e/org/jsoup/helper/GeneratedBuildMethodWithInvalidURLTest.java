package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedBuildMethodWithInvalidURLTest {

    @Test
    public void BuildMethodWithInvalidURLTest() {
        try {
            URL testUrl = new URL("invalid_url");
            UrlBuilder urlBuilderTest = new UrlBuilder(testUrl);
            URL resultUrl = urlBuilderTest.build();
            Assert.fail("Expected exception not thrown");
        } catch (Exception e) {
            Assert.assertTrue(e instanceof MalformedURLException);
        }
    }

}