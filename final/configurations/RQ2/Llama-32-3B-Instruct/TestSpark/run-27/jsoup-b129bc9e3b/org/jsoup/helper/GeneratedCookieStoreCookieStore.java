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
public class GeneratedCookieStoreCookieStore {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @BeforeClass
    public static void setup() {
        // No need for setup
    }

    @Test
    public void cookieStoreCookieStore() throws IOException {
        CookieStore cookieStore = new LinkedHashMap<>();
        Connection connection = HttpConnection.cookieStore(cookieStore);
        Mockito.verify(connection).cookieStore(Mockito.any(CookieStore.class));
    }

}