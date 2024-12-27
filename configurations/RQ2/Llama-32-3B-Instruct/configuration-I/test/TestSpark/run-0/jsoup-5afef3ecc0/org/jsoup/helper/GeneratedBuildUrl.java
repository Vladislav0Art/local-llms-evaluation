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

public class GeneratedBuildUrl {

    @Test
    public void buildUrl() {
        UrlBuilder builder = new UrlBuilder(null);
        assertNull(builder.build());
    }

}