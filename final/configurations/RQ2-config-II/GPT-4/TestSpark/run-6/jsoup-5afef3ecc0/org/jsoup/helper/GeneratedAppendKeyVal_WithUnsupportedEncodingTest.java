package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyVal_WithUnsupportedEncodingTest {

    private final static String TEST_URL = "http://google.com";

    @Test
    public void appendKeyVal_WithUnsupportedEncodingTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("kéy");
        Mockito.when(kv.value()).thenReturn("vål");

        UrlBuilder target = new UrlBuilder(new URL(TEST_URL));
        target.appendKeyVal(kv);
    }

}