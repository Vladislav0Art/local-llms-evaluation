package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.Method;
import org.jsoup.Request;
import org.jsoup.Response;
import org.jsoup.KeyVal;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSsl_socket_factory {

    @Test
    public void ssl_socket_factory() {
        SSLSocketFactory sslSocketFactory = Mockito.mock(SSLSocketFactory.class);
        Connection connection = new HttpConnection();
        assert connection.sslSocketFactory(sslSocketFactory).equals(connection);
    }

}