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

public class GeneratedTestRequest_ReturnsCorrectRequest {

    @Mock
    private Connection connection;

    @Test
    public void testRequest_ReturnsCorrectRequest() {
        // given
        Request request = new Request();
        Connection expected = new Connection(request);
        Mockito.when(connection.openConnection()).thenReturn(expected);

        // when
        Connection actual = connection.request(request);

        // then
        assertSame(expected, actual);
    }

}