package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void buildTestWithoutQuery() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/"));
        assertEquals(new URL("http://example.com/"), builder.build());
    }

    @Test
    public void buildTestWithQuery() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/"));
        builder.appendKeyVal(new KeyVal("q", "jsoup", false));
        assertEquals(new URL("http://example.com/?q=jsoup"), builder.build());
    }

    @Test
    public void buildTestWithMultipleQuery() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/"));
        builder.appendKeyVal(new KeyVal("q", "jsoup", false));
        builder.appendKeyVal(new KeyVal("lang", "en", false));
        assertEquals(new URL("http://example.com/?q=jsoup&lang=en"), builder.build());
    }

    @Test
    public void buildTestWithEncodedQuery() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/"));
        builder.appendKeyVal(new KeyVal("q", "jsoup", false));
        builder.appendKeyVal(new KeyVal("lang", "en", false));
        builder.appendKeyVal(new KeyVal("msg", "hello world", false));
        assertEquals(new URL("http://example.com/?q=jsoup&lang=en&msg=hello+world"), builder.build());
    }

}