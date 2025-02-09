package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValEncodeErrorTest {

    @Test
    public void appendKeyValEncodeErrorTest() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            Connection.KeyVal kv = mock(Connection.KeyVal.class);
            when(kv.key()).thenReturn("\uD800\uDFFF"); // unpaired surrogate
            when(kv.value()).thenReturn("value");

            UrlBuilder builder = new UrlBuilder(inputUrl);
            builder.appendKeyVal(kv);
            Assert.fail();
        } catch (UnsupportedEncodingException e) {
            Assert.assertEquals("Invalid input string detected", e.getMessage());
        } catch (Exception e) {
            Assert.fail();
        }
    }

}