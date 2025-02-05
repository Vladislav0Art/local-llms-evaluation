package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedUrlBuilderConstructorNullURLTest {

    @Test
    public void UrlBuilderConstructorNullURLTest() {
        URL url = null;
        UrlBuilder urlBuilder = new UrlBuilder(url);
    }

}