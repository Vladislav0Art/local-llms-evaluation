package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class GeneratedUrlBuilderConstructorInvalidUrlTest {

    @Test
    public void UrlBuilderConstructorInvalidUrlTest() {
        String stringUrl = "invalid\\test\\url";
        try {
            URL url = new URL(stringUrl);
            Assert.fail("Exception should have been thrown");
        } catch (MalformedURLException e) {
            Assert.assertNotNull(e);
        }
    }

}