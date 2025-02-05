package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderConstructorExceptionTest {

    @Test
    public void UrlBuilderConstructorExceptionTest() throws MalformedURLException {
        String url = "not a url";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
    }

}