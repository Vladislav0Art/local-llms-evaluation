package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL url = new URL("http://www.google.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder);
    }

    @Test
    public void buildMethodValidUrlTest() throws Exception {
        URL url = new URL("https://www.facebook.com");
        UrlBuilder builder = new UrlBuilder(url);
        URL newUrl = builder.build();
        assertEquals(new URL("https://www.facebook.com"), newUrl);
    }

    @Test
    public void buildMethodWithQueryTest() throws Exception {
        URL url = new URL("https://www.google.com/search?q=url+builder");
        UrlBuilder builder = new UrlBuilder(url);
        URL newUrl = builder.build();
        assertEquals(new URL("https://www.google.com/search?q=url+builder"), newUrl);
    }

    @Test
    public void buildMethodWithRefTest() throws Exception {
        URL url = new URL("https://en.wikipedia.org/wiki/Unit_testing#Principles");
        UrlBuilder builder = new UrlBuilder(url);
        URL newUrl = builder.build();
        assertEquals(new URL("https://en.wikipedia.org/wiki/Unit_testing#Principles"), newUrl);
    }

    @Test
    public void buildMethodWithInvalidUrlTest() throws Exception {
        URL url = new URL("** Invalid URL **");
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("https://www.google.com/search");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal kv = Connection.KeyVal.create("q", "unit+testing");
        builder.appendKeyVal(kv);
        URL newUrl = builder.build();
        assertEquals(new URL("https://www.google.com/search?q=unit%2Btesting"), newUrl);
    }

}