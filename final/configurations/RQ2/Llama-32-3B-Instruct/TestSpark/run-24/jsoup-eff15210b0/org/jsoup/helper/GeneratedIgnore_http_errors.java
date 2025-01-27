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

public class GeneratedIgnore_http_errors {

    @Test
    public void ignore_http_errors() {
        Connection connection = new HttpConnection();
        assert connection.ignoreHttpErrors(true).equals(connection);
        assert connection.ignoreHttpErrors(false).equals(connection);
    }

}