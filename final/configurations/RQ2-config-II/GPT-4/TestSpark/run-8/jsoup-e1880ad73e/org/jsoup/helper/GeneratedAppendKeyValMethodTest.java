package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValMethodTest {

    @Test
    public void AppendKeyValMethodTest() {
        try {
            URL testUrl = new URL("https://www.google.com");
            Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(kv.key()).thenReturn("key");
            Mockito.when(kv.value()).thenReturn("value");
            UrlBuilder urlBuilderTest = new UrlBuilder(testUrl);
            urlBuilderTest.appendKeyVal(kv);
            URL resultUrl = urlBuilderTest.build();
            Assert.assertTrue(resultUrl.toString().contains("key=value"));
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

}