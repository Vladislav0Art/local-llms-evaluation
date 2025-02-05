package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedUrlBuilderNullInputUrlTest {

    @Test
    public void UrlBuilderNullInputUrlTest() throws MalformedURLException {
        URL inputUrl = null;
        boolean thrown = false;
        try {
            UrlBuilder builder = new UrlBuilder(inputUrl);
        } catch (NullPointerException e) {
            thrown = true;
        }
        Assert.assertTrue(thrown);
    }

}