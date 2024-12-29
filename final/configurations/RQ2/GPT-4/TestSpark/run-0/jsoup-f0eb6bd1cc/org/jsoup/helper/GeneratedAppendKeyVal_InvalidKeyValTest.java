package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyVal_InvalidKeyValTest {

    @Test
    public void appendKeyVal_InvalidKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL inputUrl = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("param");
        Mockito.when(keyVal.value()).thenReturn("%");

        urlBuilder.appendKeyVal(keyVal);
    }

}