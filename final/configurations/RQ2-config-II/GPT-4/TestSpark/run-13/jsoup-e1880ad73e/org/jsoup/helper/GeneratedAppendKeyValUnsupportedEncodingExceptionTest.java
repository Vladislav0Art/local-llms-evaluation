package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.UnsupportedEncodingException;

public class GeneratedAppendKeyValUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws UnsupportedEncodingException {
        try {
            URL url = new URL("http://test.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(keyVal.toString()).thenReturn(new String(new byte[]{(byte) 0xC3, (byte) 0x28}, "ISO-8859-1"));
            urlBuilder.appendKeyVal(keyVal);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}