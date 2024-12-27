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

public class GeneratedAppendUrl {

    @Test
    public void appendUrl() {
        String url = "https://example.com";

        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(url, builder.build().toString());
    }

}