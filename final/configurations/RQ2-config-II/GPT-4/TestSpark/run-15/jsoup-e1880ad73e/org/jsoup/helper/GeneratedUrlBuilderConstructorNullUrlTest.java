package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderConstructorNullUrlTest {

    @Test
    public void urlBuilderConstructorNullUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

}