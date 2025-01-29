package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestGetRequestWithException {

    private Connection connection = mock(Connection.class);
    private Request request;

    @Test
    public void testGetRequestWithException() {
        doThrow(new RuntimeException()).when(connection).execute();

        when(request.execute()).thenReturn(new Response("ok", "response"));
        when(connection.getResponse()).thenReturn(response);
        when(connection.getMessage()).thenReturn("error");

        connection.setRequest(request);
        connection.execute();
        verify(response, never());
    }

}