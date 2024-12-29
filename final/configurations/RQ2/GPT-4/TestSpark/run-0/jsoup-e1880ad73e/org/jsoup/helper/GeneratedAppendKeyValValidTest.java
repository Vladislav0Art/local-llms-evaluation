package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

public class GeneratedAppendKeyValValidTest {

    @Test
    public void appendKeyValValidTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://localhost");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("Key");
        Mockito.when(keyVal.value()).thenReturn("Value");

        urlBuilder.appendKeyVal(keyVal);

        URL builtUrl = urlBuilder.build();
        assertNotNull(builtUrl);
        assertEquals("http://localhost?Key=Value", builtUrl.toString());
    }

}