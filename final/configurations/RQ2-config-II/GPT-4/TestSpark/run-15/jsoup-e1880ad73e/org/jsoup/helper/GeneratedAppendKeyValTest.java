package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = null;
        try {
            inputUrl = new URL("https://example.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal mockKeyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(mockKeyVal.key()).thenReturn("key");
        Mockito.when(mockKeyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(mockKeyVal);
        URL outputUrl = urlBuilder.build();

        Assert.assertNotNull(outputUrl);
        Assert.assertTrue(outputUrl.toString().contains("key=value"));
    }

}