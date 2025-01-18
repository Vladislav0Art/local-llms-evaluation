package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValUnsupportedEncodingTest {

    @Test
    public void appendKeyValUnsupportedEncodingTest() {
        try {
            URL url = new URL("https://www.google.com");
            UrlBuilder ub = new UrlBuilder(url);
            Connection.KeyVal kv = mock(Connection.KeyVal.class);

            when(kv.key()).thenReturn("\uD84C\uDFB4");
            when(kv.value()).thenReturn("\uD84C\uDFB4");

            ub.appendKeyVal(kv);
            fail("Exception should have been thrown due to unsupported encoding.");
        } catch (UnsupportedEncodingException e) {
            assertNotNull(e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception was thrown.");
        }
    }

}