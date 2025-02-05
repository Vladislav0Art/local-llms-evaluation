package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValWithUnsupportedEncodingExceptionTest {

    @Test
    public void AppendKeyValWithUnsupportedEncodingExceptionTest() {
        try {
            URL testUrl = new URL("https://www.google.com");
            Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(kv.key()).thenReturn("key");
            Mockito.when(kv.value()).thenThrow(UnsupportedEncodingException.class);
            UrlBuilder urlBuilderTest = new UrlBuilder(testUrl);
            urlBuilderTest.appendKeyVal(kv);
            Assert.fail("Expected exception not thrown");
        } catch (Exception e) {
            Assert.assertTrue(e instanceof UnsupportedEncodingException);
        }
    }

}