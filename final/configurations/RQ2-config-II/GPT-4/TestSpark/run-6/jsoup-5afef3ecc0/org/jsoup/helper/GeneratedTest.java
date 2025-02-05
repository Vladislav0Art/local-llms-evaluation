package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedTest {

    private final static String TEST_URL = "http://google.com";

    @Test
    public void UrlBuilder_ConstructorTest() throws Exception {
        UrlBuilder target = new UrlBuilder(new URL(TEST_URL));
        Assert.assertNotNull(target);
    }

    @Test
    public void UrlBuilder_NullUrlTest() {
        new UrlBuilder(null);
    }

    @Test
    public void build_WithValidUrlTest() throws Exception {
        UrlBuilder target = new UrlBuilder(new URL(TEST_URL));
        URL result = target.build();
        Assert.assertNotNull(result);
        Assert.assertEquals(TEST_URL, result.toString());
    }

    @Test
    public void appendKeyVal_WithValidKeyValTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("key");
        Mockito.when(kv.value()).thenReturn("val");

        UrlBuilder target = new UrlBuilder(new URL(TEST_URL));
        target.appendKeyVal(kv);
        URL result = target.build();
        Assert.assertNotNull(result);
        Assert.assertEquals(TEST_URL + "?key=val", result.toString());
    }

    @Test
    public void appendKeyVal_WithUnsupportedEncodingTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("kéy");
        Mockito.when(kv.value()).thenReturn("vål");

        UrlBuilder target = new UrlBuilder(new URL(TEST_URL));
        target.appendKeyVal(kv);
    }

}