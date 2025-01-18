package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValValidKeyValTest {

    @Test
    public void appendKeyValValidKeyValTest() {
        try {
            URL url = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);

            Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
            when(keyVal.key()).thenReturn("key");
            when(keyVal.value()).thenReturn("value");

            urlBuilder.appendKeyVal(keyVal);
        } catch (UnsupportedEncodingException | MalformedURLException e) {
            e.printStackTrace();
        }
    }

}