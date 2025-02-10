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

public class GeneratedTest {

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

    @Test
    public void testConnectString_returnsCorrectResponse() throws IOException {
        // given
        String url = "https://example.com";
        HttpURLConnection expected = (HttpURLConnection) new URL(url).openConnection();
        Mockito.when(connection.openConnection()).thenReturn(expected);

        // when
        Response actual = HttpConnection.connect(url);

        // then
        assertSame(expected, actual);
    }

    @Test
    public void testGet_returnsCorrectResponse() throws IOException {
        // given
        Connection connection = new Connection(new URL("https://example.com"));
        HttpURLConnection expected = (HttpURLConnection) new URL("https://example.com").openConnection();
        Mockito.when(connection.openConnection()).thenReturn(expected);

        // when
        Response actual = connection.get();

        // then
        assertSame(expected, actual);
    }

    @Test
    public void testPost_returnsCorrectResponse() throws IOException {
        // given
        Connection connection = new Connection(new URL("https://example.com"));
        HttpURLConnection expected = (HttpURLConnection) new URL("https://example.com").openConnection();
        Mockito.when(connection.openConnection()).thenReturn(expected);

        // when
        Response actual = connection.post();

        // then
        assertSame(expected, actual);
    }

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