package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedTest {

    @Test
    public void buildUrlTest() throws MalformedURLException, URISyntaxException {
        URL url = new URL("https://example.com/path/to/page?key1=value1&key2=value2#ref");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL newUrl = urlBuilder.build();

        Assert.assertEquals("https://xn--example-hva.com/path/to/page?key1=value1&key2=value2#ref", newUrl.toString());
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("https://example.com/path/to/page?key1=value1&key2=value2#ref");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal keyVal = new Connection.KeyVal("key3", "value3");
        urlBuilder.appendKeyVal(keyVal);

        Assert.assertEquals("key3=value3", urlBuilder.q.toString());
    }

}