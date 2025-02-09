package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedUrlBuilderConstructorNullInputTest {

    @Test
    public void UrlBuilderConstructorNullInputTest() {
        try {
            new UrlBuilder(null);
            Assert.fail();
        } catch (NullPointerException e) {
            Assert.assertEquals("URL input couldn't be null", e.getMessage());
        }
    }

}