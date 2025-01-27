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

public class GeneratedMethod {

    @Test
    public void method() {
        Connection connection = new HttpConnection();
        assert connection.method(Method.GET).equals(connection);
        assert connection.method(Mockito.mock(Method.class)).equals(connection);
    }

}