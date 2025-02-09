package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() {
        try {
            URL inputUrl = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(kv.key()).thenReturn("key");
            Mockito.when(kv.value()).thenReturn("\uD800");
            urlBuilder.appendKeyVal(kv);
            Assert.fail("Should have thrown UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            assert (true);
        } catch (Exception e) {
            e.printStackTrace();
            assert (false);
        }
    }

}