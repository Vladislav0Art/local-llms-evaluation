package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedUrlBuilderConstructorNullUrlTest {

    @Test
    public void UrlBuilderConstructorNullUrlTest() {
        UrlBuilder builder = new UrlBuilder(null);
    }

}