package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws Exception {
        URL inputUrl = new URL("http://www.test.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("key");
        when(kv.value()).thenThrow(new UnsupportedEncodingException());

        urlBuilder.appendKeyVal(kv);
    }

}