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

public class GeneratedConnect_url_with_proxy {

    @Test
    public void connect_url_with_proxy() {
        Connection connection = new HttpConnection();
        Proxy proxy = Mockito.mock(Proxy.class);
        assert connection.connect("http://example.com", proxy).equals(connection);
    }

}