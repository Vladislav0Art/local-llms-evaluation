package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.jsoup.Connection.KeyVal.create;
import static org.junit.Assert.assertEquals;

public class GeneratedBuildWithInvalidURLTest {

    @Test
    public void buildWithInvalidURLTest() throws Exception {
        URL url = new URL("https:/www.exampl e.com/?key1=val1&key2=val2"); //Invalid URL
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

}