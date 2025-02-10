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

public class GeneratedTestExecute_returnsCorrectResponse {

    @Mock
    private Connection connection;

    @Test
    public void testExecute_returnsCorrectResponse() throws IOException {
        // given
        Connection connection = new Connection(new URL("https://example.com"));
        HttpURLConnection expected = (HttpURLConnection) new URL("https://example.com").openConnection();
        Mockito.when(connection.openConnection()).thenReturn(expected);

        // when
        Response actual = connection.execute();

        // then
        assertSame(expected, actual);
    }

}