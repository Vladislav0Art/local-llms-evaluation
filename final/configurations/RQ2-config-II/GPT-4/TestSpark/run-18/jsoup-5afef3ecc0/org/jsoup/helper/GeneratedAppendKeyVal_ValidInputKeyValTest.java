package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyVal_ValidInputKeyValTest {

    @Test
    public void appendKeyVal_ValidInputKeyValTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(keyVal.key()).thenReturn("key");
            Mockito.when(keyVal.value()).thenReturn("value");

            urlBuilder.appendKeyVal(keyVal);

            Assert.assertEquals("http://example.com?key=value", urlBuilder.build().toString());
        } catch (UnsupportedEncodingException | MalformedURLException e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

}