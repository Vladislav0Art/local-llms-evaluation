package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class GeneratedUrl_ThrowsNullPointerExceptionForNullUrl {

    @Mock
    private SSLSocketFactory sslSocketFactoryMock;

    @Mock
    private HttpURLConnection httpsURLConnectionMock;

    @Test
    public void url_ThrowsNullPointerExceptionForNullUrl() {
        Assertions.assertThrows(NullPointerException.class, () -> HttpConnection.url(null));
    }

}