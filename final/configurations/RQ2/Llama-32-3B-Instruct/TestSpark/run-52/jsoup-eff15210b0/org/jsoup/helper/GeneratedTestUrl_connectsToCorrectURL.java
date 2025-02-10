package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;

public class GeneratedTestUrl_connectsToCorrectURL {

    @Mock
    private Connection connection;

    @Test
    public void testUrl_connectsToCorrectURL() throws IOException {
        // given
        URL url = new URL("https://example.com");
        String expectedUrl = url.toString();
        Mockito.when(new URL(url).openConnection()).thenReturn(expectedUrl);

        // when
        Response actual = HttpConnection.connect(url);

        // then
        assertSame(expectedUrl, actual);
    }

}