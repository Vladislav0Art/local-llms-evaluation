package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderNullInputTest {

    @Test
    public void UrlBuilderNullInputTest() {
        new UrlBuilder(null);
    }

}