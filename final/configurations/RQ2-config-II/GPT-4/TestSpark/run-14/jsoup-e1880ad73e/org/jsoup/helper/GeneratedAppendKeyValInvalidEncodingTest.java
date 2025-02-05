package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class GeneratedAppendKeyValInvalidEncodingTest {

    @Test
    public void appendKeyValInvalidEncodingTest() throws UnsupportedEncodingException {
        String url = "http://test.url";
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
            Connection.KeyVal mockKeyVal = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(mockKeyVal.key()).thenReturn("\uD800");
            urlBuilder.appendKeyVal(mockKeyVal);

        } catch (MalformedURLException e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

}