package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(kv.key()).thenReturn("key");
            Mockito.when(kv.value()).thenReturn("value");

            urlBuilder.appendKeyVal(kv);
            URL builtUrl = urlBuilder.build();
            assertTrue(builtUrl.toString().contains("key=value"));
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            fail("Test failed due to MalformedURLException or UnsupportedEncodingException.");
        }
    }

}