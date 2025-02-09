package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertNotNull;

public class GeneratedUrlBuilderCreationNullUrlTest {

    @Test
    public void urlBuilderCreationNullUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

}