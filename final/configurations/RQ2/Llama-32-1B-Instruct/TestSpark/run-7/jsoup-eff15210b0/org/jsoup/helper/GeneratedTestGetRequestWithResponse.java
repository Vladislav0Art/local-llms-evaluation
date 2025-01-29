package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestGetRequestWithResponse {

    private Connection connection = mock(Connection.class);
    private Request request;

    @Test
    public void testGetRequestWithResponse() {
        Response response = new Response("ok", "response");
        doReturn(response).when(connection).execute();

        when(request.execute()).thenReturn(response);
        when(connection.getResponse()).thenReturn(response);
        when(connection.getMessage()).thenReturn("");

        connection.setRequest(request);
        connection.execute();
        verifyNoMoreInteractions(connection);
    }

}