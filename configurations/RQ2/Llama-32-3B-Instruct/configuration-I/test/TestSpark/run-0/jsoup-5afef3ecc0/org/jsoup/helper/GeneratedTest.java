package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;

import org.mockito.Mockito;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Connection;

public class GeneratedTest {

    @Test
    public void newUrlBuilder() {
        assertNotNull(new UrlBuilder(null));
    }

    @Test
    public void buildUrl() {
        UrlBuilder builder = new UrlBuilder(null);
        assertNull(builder.build());
    }

    @Test
    public void appendKeyVal() throws Exception {
        org.jsoup.Connection.KeyVal kv = Mockito.mock(org.jsoup.Connection.KeyVal.class);
        when(kv.getKey()).thenReturn("key");
        when(kv.getValue()).thenReturn("value");

        UrlBuilder builder = new UrlBuilder(null);

        builder.appendKeyVal(kv);

        assertNotNull(builder.build());
    }

    @Test
    public void appendUrl() {
        String url = "https://example.com";

        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(url, builder.build().toString());
    }

    @Test
    public void appendParam() {
        String url = "https://example.com";
        String paramName = "paramName";
        String paramValue = "ParameterValue";

        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new org.jsoup.Connection.KeyVal(paramName, paramValue));

        assertEquals("https://example.com?paramName=ParameterValue", builder.build().toString());
    }

    @Test
    public void appendUrlWithQuery() {
        String url = "https://example.com";
        String queryParam1 = "queryParam1";
        String queryParam2 = "queryParam2";

        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new org.jsoup.Connection.KeyVal(queryParam1, "QueryParam1Value"));
        builder.appendKeyVal(new org.jsoup.Connection.KeyVal(queryParam2, "QueryParam2Value"));

        assertEquals("https://example.com?queryParams[0].key=queryParam1&queryParams[0].value=QueryParam1Value&queryParams[1].key=queryParam2&queryParams[1].value=QueryParam2Value", builder.build().toString());
    }

    @Test
    public void appendUrlWithQueryAndParams() {
        String url = "https://example.com";
        String queryParam1 = "queryParam1";
        String queryParam2 = "queryParam2";
        String paramName1 = "paramName1";
        String paramValue1 = "ParameterValue1";

        UrlBuilder builder = new UrlBuilder(url);
        org.jsoup.Connection.KeyVal kv1 = new org.jsoup.Connection.KeyVal(paramName1, paramValue1);
        org.jsoup.Connection.KeyVal kv2 = new org.jsoup.Connection.KeyVal(queryParam1, "QueryParam1Value");
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);

        assertEquals("https://example.com?queryParams[0].key=paramName1&queryParams[0].value=ParameterValue1&queryParams[1].key=queryParam1&queryParams[1].value=QueryParam1Value", builder.build().toString());
    }

}