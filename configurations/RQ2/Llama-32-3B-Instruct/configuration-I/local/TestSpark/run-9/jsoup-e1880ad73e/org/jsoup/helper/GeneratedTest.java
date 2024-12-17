package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void buildUrlEmptyScenarioTest() {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(null);

        // when
        URL url = urlBuilder.build();

        // then
        assertNull(url);
    }

    @Test
    public void appendKeyValScenarioTest() throws UnsupportedEncodingException {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new org.jsoup.helper.Connection.KeyVal("key", "value");

        // when
        urlBuilder.appendKeyVal(kv);

        // then
        assertTrue(urlBuilder.build().getQuery().contains("key=value"));
    }

    @Test
    public void appendMultipleKeyValsScenarioTest() throws UnsupportedEncodingException {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        org.jsoup.helper.Connection.KeyVal kv1 = new org.jsoup.helper.Connection.KeyVal("key1", "value1");
        org.jsoup.helper.Connection.KeyVal kv2 = new org.jsoup.helper.Connection.KeyVal("key2", "value2");

        // when
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);

        // then
        assertTrue(urlBuilder.build().getQuery().contains("key1=value1&key2=value2"));
    }

    @Test
    public void appendNoQueryScenarioTest() throws UnsupportedEncodingException {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));

        // when
        urlBuilder.appendKeyVal(new org.jsoup.helper.Connection.KeyVal("key", "value"));

        // then
        assertEquals("", urlBuilder.build().getQuery());
    }

    @Test
    public void appendNoValueScenarioTest() throws UnsupportedEncodingException {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        org.jsoup.helper.Connection.KeyVal kv = new org.jsoup.helper.Connection.KeyVal("key", null);

        // when
        urlBuilder.appendKeyVal(kv);

        // then
        assertTrue(urlBuilder.build().getQuery().contains("key="));
    }

    @Test
    public void appendNullUrlScenarioTest() {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(null);

        // when
        try {
            urlBuilder.build();
            fail("Expected exception not thrown");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void buildMultipleQueriesScenarioTest() throws UnsupportedEncodingException {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        org.jsoup.helper.Connection.KeyVal kv1 = new org.jsoup.helper.Connection.KeyVal("key1", "value1");
        org.jsoup.helper.Connection.KeyVal kv2 = new org.jsoup.helper.Connection.KeyVal("key2", "value2");

        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);

        // when
        URL url = urlBuilder.build();

        // then
        assertEquals("?key1=value1&key2=value2", url.toString());
    }

}