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

public class GeneratedAppendUrlWithQueryAndParams {

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