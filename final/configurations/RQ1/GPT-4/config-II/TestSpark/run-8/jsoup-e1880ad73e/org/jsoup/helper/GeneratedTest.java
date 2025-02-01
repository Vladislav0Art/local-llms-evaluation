package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorTest() throws Exception {
        URL inputUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Assert.assertNotNull(urlBuilder);
    }

    @Test
    public void buildWithNoQueryNoRefTest() throws Exception {
        URL inputUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        Assert.assertEquals(inputUrl, resultUrl);
    }

    @Test
    public void buildWithQueryAndRefTest() throws Exception {
        URL inputUrl = new URL("http://test.com?search=test#page1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        Assert.assertEquals(inputUrl, resultUrl);
    }

    @Test
    public void appendKeyValWhenNoQueryTest() throws Exception {
        URL inputUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL builtUrl = urlBuilder.build();
        Assert.assertEquals("http://test.com?key=value", builtUrl.toString());
    }

    @Test
    public void appendKeyValWhenQueryExistsTest() throws Exception {
        URL inputUrl = new URL("http://test.com?search=test#page1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("additional_key", "additional_value");
        urlBuilder.appendKeyVal(kv);
        URL builtUrl = urlBuilder.build();
        Assert.assertEquals("http://test.com?search=test&additional_key=additional_value#page1", builtUrl.toString());
    }

    @Test
    public void decodePartUnsupportedEncodingExceptionThrowsRuntimeExceptionTest() throws Exception {
        UrlBuilder.decodePart("\ud800");
    }

    @Test
    public void appendToAsciiCharactersInRangeTest() throws Exception {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("Test", false, sb);
        Assert.assertEquals("Test", sb.toString());
    }

    @Test
    public void appendToAsciiCharactersOutOfRangeTest() throws Exception {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("\u20AC", false, sb);
        Assert.assertNotEquals("\u20AC", sb.toString());
    }

    @Test
    public void appendToAsciiSpaceAsPlusTest() throws Exception {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("Test Test", true, sb);
        Assert.assertEquals("Test+Test", sb.toString());
    }

    @Test
    public void appendToAsciiSpaceAsPercent20Test() throws Exception {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("Test Test", false, sb);
        Assert.assertEquals("Test%20Test", sb.toString());
    }

}