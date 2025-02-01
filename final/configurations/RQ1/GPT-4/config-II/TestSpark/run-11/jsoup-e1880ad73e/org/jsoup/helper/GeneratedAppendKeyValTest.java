package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
        when(keyValMock.key()).thenReturn("key");
        when(keyValMock.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyValMock);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://example.com?key=value", resultUrl.toString());
    }

}