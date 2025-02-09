package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedBuildOnBuildBaseUrlTest {

    @Test
    public void buildOnBuildBaseUrlTest() {
        try {
            URL inputUrl = new URL("https://www.example.com/path");
            URL expected = new URL("https://www.example.com");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            Assert.assertEquals(expected, builder.build());
        } catch (Exception e) {
            Assert.fail();
        }
    }

}