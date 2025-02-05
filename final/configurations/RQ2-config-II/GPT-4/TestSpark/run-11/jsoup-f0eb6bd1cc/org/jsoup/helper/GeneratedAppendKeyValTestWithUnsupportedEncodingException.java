package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.URL;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedAppendKeyValTestWithUnsupportedEncodingException {

    @Test
    public void appendKeyValTestWithUnsupportedEncodingException() throws Exception {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("unsupported");
        when(kv.value()).thenReturn("unsupported");

        URL inputUrl = new URL("http://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
    }

}