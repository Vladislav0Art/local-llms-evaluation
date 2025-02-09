package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

public class GeneratedUrlStringMalformedTest {

    @Test
    public void urlStringMalformedTest() {
        String url = "non_url";
        HttpConnection httpConnection = new HttpConnection();
        try {
            Connection connectionResult = httpConnection.url(url);
            Assert.fail("No exception caught");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e instanceof IllegalArgumentException);
        }
    }

}