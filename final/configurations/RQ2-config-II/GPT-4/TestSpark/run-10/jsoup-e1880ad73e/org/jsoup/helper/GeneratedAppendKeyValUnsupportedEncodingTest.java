package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValUnsupportedEncodingTest {

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL inputUrl = null;
        try {
            inputUrl = new URL("http://localhost");
        } catch (MalformedURLException ex) {
            fail("MalformedURLException thrown: " + ex.getMessage());
        }
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.toString()).thenReturn(new String(new byte[]{(byte) 0xFFFFFFFF}, "US-ASCII"));

        urlBuilder.appendKeyVal(keyVal);
    }

}