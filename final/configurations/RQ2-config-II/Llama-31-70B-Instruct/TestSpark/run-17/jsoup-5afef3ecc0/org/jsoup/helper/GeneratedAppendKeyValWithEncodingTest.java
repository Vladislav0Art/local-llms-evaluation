package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValWithEncodingTest {

    @Mock
    private URL inputUrl;

    @Mock
    private Connection.KeyVal keyVal;

    @Test
    public void appendKeyValWithEncodingTest() throws UnsupportedEncodingException {
        when(keyVal.getKey()).thenReturn("key");
        when(keyVal.getValue()).thenReturn("value with space");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("key=value+with+space", urlBuilder.query());
    }

}