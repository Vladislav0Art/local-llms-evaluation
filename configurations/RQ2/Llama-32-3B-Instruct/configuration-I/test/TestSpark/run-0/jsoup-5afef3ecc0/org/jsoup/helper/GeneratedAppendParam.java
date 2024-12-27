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

public class GeneratedAppendParam {

    @Test
    public void appendParam() {
        String url = "https://example.com";
        String paramName = "paramName";
        String paramValue = "ParameterValue";

        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new org.jsoup.Connection.KeyVal(paramName, paramValue));

        assertEquals("https://example.com?paramName=ParameterValue", builder.build().toString());
    }

}