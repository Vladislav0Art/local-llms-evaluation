package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedExecute {

    @Mock
    private Connection connection;

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private Parser parser;

    @Test
    public void execute() throws IOException {
        // given
        Connection connection = new Connection(new URL("https://example.com"));
        Connection.Response response = new Connection.Response();

        // when
        Connection.Response actual = connection.execute();

        // then
        Mockito.verify(connection).execute();
        assertSame(response, actual);
    }

}