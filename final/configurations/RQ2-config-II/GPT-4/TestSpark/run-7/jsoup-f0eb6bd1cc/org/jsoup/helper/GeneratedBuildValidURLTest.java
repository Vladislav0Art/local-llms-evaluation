package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildValidURLTest {

    @Test
    public void buildValidURLTest() {
        try {
            URL inputUrl = new URL("http://localhost");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            URL resultUrl = urlBuilder.build();
            assertEquals(inputUrl, resultUrl);
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }

}