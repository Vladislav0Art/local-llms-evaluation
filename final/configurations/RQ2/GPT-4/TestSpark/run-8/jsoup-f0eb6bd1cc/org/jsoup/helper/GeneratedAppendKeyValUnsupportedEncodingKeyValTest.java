package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValUnsupportedEncodingKeyValTest {

    @Test
    public void appendKeyValUnsupportedEncodingKeyValTest() throws UnsupportedEncodingException {
        try {
            URL url = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);

            Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
            when(keyVal.key()).thenReturn("key\u0019");
            when(keyVal.value()).thenReturn("value\u0019");

            urlBuilder.appendKeyVal(keyVal);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}