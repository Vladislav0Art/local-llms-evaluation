package org.jsoup.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private UrlBuilder urlBuilder;
    private URL url;

    @Before
    public void setUp() throws MalformedURLException {
        url = new URL("http://www.jsoup.org/");
        urlBuilder = new UrlBuilder(url);
    }

    @After
    public void tearDown() {
        url = null;
        urlBuilder = null;
    }

    @Test
    public void buildUrlTest() throws MalformedURLException, URISyntaxException {
        when(urlBuilder.build()).thenReturn(url);
        assertEquals(urlBuilder.build(), url);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        when(kv.getKey()).thenReturn(key);
        when(kv.getValue()).thenReturn(value);

        urlBuilder.appendKeyVal(kv);
        assertEquals(urlBuilder.q.toString(), "key=value");
    }

}