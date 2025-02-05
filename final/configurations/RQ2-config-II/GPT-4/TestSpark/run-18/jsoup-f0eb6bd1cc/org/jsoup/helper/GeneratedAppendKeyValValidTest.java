package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValValidTest {

    @Test
    public void appendKeyValValidTest() throws UnsupportedEncodingException {
        URL inputUrl = null;
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("testKey");
        when(kv.value()).thenReturn("testValue");
        try {
            inputUrl = new URL("http://www.example.com");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            builder.appendKeyVal(kv);
            URL resultUrl = builder.build();
            String expectedUrl = "http://www.example.com?testKey=testValue";
            Assert.assertEquals(resultUrl.toString(), URLDecoder.decode(expectedUrl, "UTF-8"));
        } catch (MalformedURLException e) {
            Assert.fail("URL is not correctly formed.");
        }
    }

}