package org.jsoup.helper;

import org.jsoup.Connection;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import java.net.URL;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL testUrl = new URL("http://domain.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);

        Connection.KeyVal mockKeyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(mockKeyVal.key()).thenReturn("key");
        Mockito.when(mockKeyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(mockKeyVal);

        URL builtUrl = urlBuilder.build();
        URL expectedUrl = new URL("http://domain.com?key=value");

        assertNotNull(builtUrl);
        assertEquals(expectedUrl, builtUrl);
    }

}