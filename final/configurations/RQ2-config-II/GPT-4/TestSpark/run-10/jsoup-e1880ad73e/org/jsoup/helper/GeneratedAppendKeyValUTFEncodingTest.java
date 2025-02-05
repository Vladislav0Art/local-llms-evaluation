package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValUTFEncodingTest {

    @Test
    public void appendKeyValUTFEncodingTest() {
        try {
            URL inputUrl = new URL("http://localhost");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(keyVal.toString()).thenReturn("key=value");

            urlBuilder.appendKeyVal(keyVal);
            URL builtUrl = urlBuilder.build();

            assertTrue(builtUrl.toString().contains("key=value"));
        } catch (MalformedURLException | UnsupportedEncodingException ex) {
            fail("Exception thrown: " + ex.getMessage());
        }
    }

}