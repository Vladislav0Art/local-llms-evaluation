package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection.KeyVal;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderNullURLTest {

    @Test
    public void UrlBuilderNullURLTest() {
        URL url = null;
        UrlBuilder urlBuilder = new UrlBuilder(url);
    }

}