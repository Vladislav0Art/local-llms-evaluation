package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedBuildMethodWithValidURLTest {

    @Test
    public void BuildMethodWithValidURLTest() {
        try {
            URL testUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilderTest = new UrlBuilder(testUrl);
            URL resultUrl = urlBuilderTest.build();
            Assert.assertNotNull(resultUrl);
            Assert.assertEquals(testUrl.toString(), resultUrl.toString());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

}