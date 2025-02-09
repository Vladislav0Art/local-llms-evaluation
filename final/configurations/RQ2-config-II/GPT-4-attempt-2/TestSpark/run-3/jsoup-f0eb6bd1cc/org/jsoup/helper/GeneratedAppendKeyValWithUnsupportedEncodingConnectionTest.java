package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.hamcrest.core.IsEqual.equalTo;

public class GeneratedAppendKeyValWithUnsupportedEncodingConnectionTest {

    @Test
    public void appendKeyValWithUnsupportedEncodingConnectionTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.value()).thenReturn("unsupported");

        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
    }

}