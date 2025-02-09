package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            Connection.KeyVal kv = mock(Connection.KeyVal.class);
            when(kv.key()).thenReturn("key");
            when(kv.value()).thenReturn("value");

            UrlBuilder builder = new UrlBuilder(inputUrl);
            builder.appendKeyVal(kv);
        } catch (Exception e) {
            Assert.fail();
        }
    }

}