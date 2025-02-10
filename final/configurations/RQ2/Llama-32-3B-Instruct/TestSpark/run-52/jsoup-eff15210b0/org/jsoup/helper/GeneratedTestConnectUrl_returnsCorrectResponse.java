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

public class GeneratedTestConnectUrl_returnsCorrectResponse {

    @Mock
    private Connection connection;

    @Test
    public void testConnectUrl_returnsCorrectResponse() throws IOException {
        // given
        String url = "https://example.com";
        HttpURLConnection expected = (HttpURLConnection) new URL(url).openConnection();
        Mockito.when(connection.openConnection()).thenReturn(expected);

        // when
        Response actual = HttpConnection.connect(url);

        // then
        assertSame(expected, actual);
    }

}