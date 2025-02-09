package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private URL url;

    @Test
    public void urlBuilderConstructorInvalidUrlTest() throws MalformedURLException {
        new UrlBuilder(null);
    }

    @Test
    public void urlBuilderConstructorValidUrlTest() {
        new UrlBuilder(url);
    }

    @Test
    public void appendKeyValNullValueTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(this.getClass().getResource("/"));
        urlBuilder.appendKeyVal(null);
    }

    @Test
    public void appendKeyValValueTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(this.getClass().getResource("/"));
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        urlBuilder.appendKeyVal(kv);
    }

    @Test
    public void buildTest() {
        UrlBuilder urlBuilder = new UrlBuilder(this.getClass().getResource("/"));
        urlBuilder.build();
    }

}