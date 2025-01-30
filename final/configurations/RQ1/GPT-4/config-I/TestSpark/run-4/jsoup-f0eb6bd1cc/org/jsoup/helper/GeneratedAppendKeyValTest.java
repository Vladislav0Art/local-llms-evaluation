package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.net.URL;
import java.net.MalformedURLException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException {
        try {
            URL inputUrl = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = mock(Connection.KeyVal.class);
            when(kv.key()).thenReturn("key");
            when(kv.value()).thenReturn("value");
            urlBuilder.appendKeyVal(kv);
            URL resultUrl = urlBuilder.build();
            assertEquals("http://example.com?key=value", resultUrl.toString());
        } catch (Exception e) {
            fail("This should not have caused an exception");
        }
    }

}