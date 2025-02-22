package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;

public class GeneratedAppendKeyValTest {

    UrlBuilder urlBuilder;
    URL url;

    @Before
    public void setUp() throws MalformedURLException {
        url = new URL("https://www.jsoup.org");
        urlBuilder = new UrlBuilder(url);
    }

    @After
    public void tearDown() {
        urlBuilder = null;
        url = null;
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("key");
        Mockito.when(keyVal.value()).thenReturn("value");
        urlBuilder.appendKeyVal(keyVal);
        assertEquals(urlBuilder.q.toString(), "key=value");
    }

}