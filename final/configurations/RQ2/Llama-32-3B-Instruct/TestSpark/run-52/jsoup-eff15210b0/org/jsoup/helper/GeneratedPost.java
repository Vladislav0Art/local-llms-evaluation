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
public class GeneratedPost {

    @Mock
    private Connection connection;

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private Parser parser;

    @Test
    public void post() throws IOException {
        // given
        Connection connection = new Connection(new URL("https://example.com"));
        Document document = new Document();

        // when
        Document actual = connection.post();

        // then
        Mockito.verify(connection).execute();
        assertSame(document, actual);
    }

}