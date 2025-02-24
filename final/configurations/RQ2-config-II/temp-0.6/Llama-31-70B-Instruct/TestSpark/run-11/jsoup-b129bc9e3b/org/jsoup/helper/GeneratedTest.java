package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Mock
    private Connection.Request request;

    @Mock
    private Connection.Response response;

    private HttpConnection connection;

    @BeforeEach
    public void setUp() {
        connection = new HttpConnection();
    }

    @Test
    public void testExecuteGet() throws IOException {
        Mockito.when(request.method()).thenReturn(Connection.Method.GET);
        Mockito.when(connection.execute()).thenReturn(response);

        Connection.Response actualResponse = connection.execute();

        assertNotNull(actualResponse);
        assertEquals(response, actualResponse);
    }

}