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

public class GeneratedAppendUrlWithQuery {

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

}