package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        String stringUrl = "http://test.url";
        try {
            URL url = new URL(stringUrl);
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal keyValMock = Mockito.mock(Connection.KeyVal.class);
            try {
                urlBuilder.appendKeyVal(keyValMock);
            } catch (Exception e) {
                Assert.fail("Exception should not have been thrown");
            }
        } catch (MalformedURLException e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

}