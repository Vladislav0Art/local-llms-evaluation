package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderConstructorNullUrlTest {

    @Test
    public void UrlBuilderConstructorNullUrlTest() {
        try {
            URL url = null;
            UrlBuilder urlBuilder = new UrlBuilder(url);
        } catch (NullPointerException ex) {
            Assert.assertEquals("URL must not be null", ex.getMessage());
        }
    }

}