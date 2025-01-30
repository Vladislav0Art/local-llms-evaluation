package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void buildTest() {
        try {
            URL url1 = new URL("https://www.google.com/");
            UrlBuilder urlBuilder = new UrlBuilder(url1);
            URL url2 = urlBuilder.build();
            assertEquals(url1, url2);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void buildMalformedUrlTest() {
        try {
            URL url1 = new URL("https:www.google.com/");
            UrlBuilder urlBuilder = new UrlBuilder(url1);
            urlBuilder.build();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void appendKeyValTest() {
        try {
            Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(kv.key()).thenReturn("key");
            Mockito.when(kv.value()).thenReturn("value");
            URL url1 = new URL("https://www.google.com/");
            UrlBuilder urlBuilder = new UrlBuilder(url1);
            try {
                urlBuilder.appendKeyVal(kv);
            } catch (Exception e) {
                e.printStackTrace();
            }
            assertEquals(url1.getQuery(), StringUtil.borrowBuilder().append(url1.getQuery()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() {
        try {
            Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(kv.key()).thenReturn("\uD801\uDC00");
            Mockito.when(kv.value()).thenReturn("\uD801\uDC00");
            URL url1 = new URL("https://www.google.com/");
            UrlBuilder urlBuilder = new UrlBuilder(url1);
            try {
                urlBuilder.appendKeyVal(kv);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void UrlBuilderTest() {
        try {
            URL url = new URL("https://www.google.com/");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            assertNotNull(urlBuilder);
            assertEquals(url, urlBuilder.u);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void UrlBuilderWithQueryTest() {
        try {
            URL url = new URL("https://www.google.com/?query=test");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            assertNotNull(urlBuilder);
            assertEquals(url, urlBuilder.u);
            assertEquals(url.getQuery(), StringUtil.borrowBuilder().append(url.getQuery()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}