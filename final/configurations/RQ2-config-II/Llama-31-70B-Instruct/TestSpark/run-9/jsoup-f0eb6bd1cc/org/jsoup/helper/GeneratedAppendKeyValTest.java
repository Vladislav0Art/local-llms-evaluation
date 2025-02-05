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
public class GeneratedAppendKeyValTest {

    @Mock
    private Connection.KeyVal keyVal;

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        when(keyVal.getKey()).thenReturn("key");
        when(keyVal.getValue()).thenReturn("value");
        when(keyVal.getEncodedValue()).thenReturn(URLEncoder.encode("value", DataUtil.UTF_8));

        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("http://www.example.com?key=value", urlBuilder.build().toString());
    }

}