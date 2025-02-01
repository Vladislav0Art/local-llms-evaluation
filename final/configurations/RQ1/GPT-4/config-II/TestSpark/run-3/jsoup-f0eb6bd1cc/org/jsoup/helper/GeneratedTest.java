package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class GeneratedTest {

    @Test
    public void UrlBuilderURLNotNullTest() throws Exception {
        String query = "sampleQuery";
        URL url = new URL("http://sampledomain.com?sampleQuery");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertEquals(query, urlBuilder.q.toString());
    }

    @Test
    public void UrlBuilderURLIsEmptyTest() throws Exception {
        URL url = new URL("http://sampledomain.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertNull(urlBuilder.q);
    }

    @Test
    public void buildWithNotNullRefTest() throws Exception {
        URL url = new URL("http://sampledomain.com#sampleRef");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals(url, actualUrl);
    }

    @Test
    public void buildWithNullRefTest() throws Exception {
        URL url = new URL("http://sampledomain.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals(url, actualUrl);
    }

    @Test
    public void buildMalformedURLExceptionTest() throws Exception {
        URL url = new URL("sampleUrl");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://sampledomain.com");
        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(keyVal);
        Assert.assertEquals("key=value", urlBuilder.q.toString());
    }

    @Test
    public void AppendKeyValMultipleTest() throws Exception {
        URL url = new URL("http://sampledomain.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(Connection.KeyVal.create("key1", "value1"));
        urlBuilder.appendKeyVal(Connection.KeyVal.create("key2", "value2"));
        Assert.assertEquals("key1=value1&key2=value2", urlBuilder.q.toString());
    }

}