package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildValidUrlTest {

    @Mock
    private Connection.KeyVal mockKeyVal;

    @Test
    public void BuildValidUrlTest() {
        URL url = null;

        try {
            url = new URL("http://www.example.com");
        } catch (MalformedURLException e) {
            Assert.fail("Could not construct URL: " + e.getMessage());
        }

        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();

        Assert.assertEquals(url, builtUrl);
    }

}