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

public class GeneratedAppendKeyVal {

    @Test
    public void appendKeyVal() throws Exception {
        org.jsoup.Connection.KeyVal kv = Mockito.mock(org.jsoup.Connection.KeyVal.class);
        when(kv.getKey()).thenReturn("key");
        when(kv.getValue()).thenReturn("value");

        UrlBuilder builder = new UrlBuilder(null);

        builder.appendKeyVal(kv);

        assertNotNull(builder.build());
    }

}