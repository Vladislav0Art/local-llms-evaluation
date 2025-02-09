package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.net.UnsupportedEncodingException;

public class GeneratedBuildNullUrlTest {

    @Test
    public void buildNullUrlTest() {
        UrlBuilder builder = new UrlBuilder(null);
        builder.build();
    }

}