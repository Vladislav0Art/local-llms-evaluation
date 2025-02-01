package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com?q=test");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
        when(keyValMock.key()).thenReturn("newKey");
        when(keyValMock.value()).thenReturn("newValue");

        urlBuilder.appendKeyVal(keyValMock);
    }

}