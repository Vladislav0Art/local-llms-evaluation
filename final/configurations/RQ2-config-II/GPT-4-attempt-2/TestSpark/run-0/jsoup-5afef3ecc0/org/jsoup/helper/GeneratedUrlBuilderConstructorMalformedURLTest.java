package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedUrlBuilderConstructorMalformedURLTest {

    @Test
    public void UrlBuilderConstructorMalformedURLTest() {
        try {
            URL inputUrl = new URL("htp:/example.com");
            Assert.fail("Should have thrown MalformedURLException");
        } catch (MalformedURLException e) {
            assert (true);
        }
    }

}