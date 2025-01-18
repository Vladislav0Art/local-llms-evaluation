package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValInvalidTest {

    @Test
    public void appendKeyValInvalidTest() throws Exception {
        URL testUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);

        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("invalidKey");
        Mockito.when(keyVal.value()).thenReturn("invalidValue");

        urlBuilder.appendKeyVal(keyVal);
    }

}