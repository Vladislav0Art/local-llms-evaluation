package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValWithNonAsciiTest {

    @Test
    public void appendKeyValWithNonAsciiTest() throws Exception {
        URL inputUrl = new URL("http://exämple.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
        when(keyValMock.key()).thenReturn("këy");
        when(keyValMock.value()).thenReturn("välue");

        urlBuilder.appendKeyVal(keyValMock);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://xn--exmple-4za.com?k%C3%ABy=v%C3%A4lue", resultUrl.toString());
    }

}