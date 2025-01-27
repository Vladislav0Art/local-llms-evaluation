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
public class GeneratedMaxBodySize {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @BeforeClass
    public static void setup() {
        // No need for setup
    }

    @Test
    public void maxBodySize() {
        int bytes = 1024;
        Connection connection = HttpConnection.maxBodySize(bytes);
        Mockito.verify(connection).maxBodySize(Mockito.anyInt());
    }

}