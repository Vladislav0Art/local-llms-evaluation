package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedMethod {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @BeforeClass
    public static void setup() {
        // No need for setup
    }

    @Test
    public void method() {
        Connection.Method method = Connection.Method.GET;
        Connection connection = HttpConnection.method(method);
        Mockito.verify(connection).method(Mockito.any(Connection.Method.class));
    }

}