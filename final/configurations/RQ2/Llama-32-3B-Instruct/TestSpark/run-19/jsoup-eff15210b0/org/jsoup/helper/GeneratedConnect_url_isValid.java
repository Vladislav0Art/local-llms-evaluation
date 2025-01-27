package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.Request;
import org.jsoup.Response;
import org.jsoup.util.DataUtil;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConnect_url_isValid {

    @Mock
    private java.net.HttpsURLConnection httpsUrlMock;

    @Mock
    private java.io.InputStream inputStreamMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void connect_url_isValid() {
        Connection connection = HttpConnection.connect("https://example.com");
        assertNotNull(connection);
    }

}