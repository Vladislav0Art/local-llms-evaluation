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

public class GeneratedFollow_redirects {

    @Test
    public void follow_redirects() {
        Connection connection = new HttpConnection();
        assert connection.followRedirects(true).equals(connection);
        assert connection.followRedirects(false).equals(connection);
    }

}