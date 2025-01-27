package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.Request;
import org.jsoup.Response;
import org.jsoup.util.DataUtil;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedExecute_responseIsExecuted_thenResponseExecuted {

    @Mock
    private java.net.HttpsURLConnection httpsUrlMock;

    @Mock
    private java.io.InputStream inputStreamMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void execute_responseIsExecuted_thenResponseExecuted() throws IOException {
        Response response = mock(Response.class);
        when(httpsUrlMock.getResponse()).thenReturn(response);
        Connection connection = HttpConnection.execute();
        assertNotNull(connection);
        assertEquals(response, connection.response());
    }

}