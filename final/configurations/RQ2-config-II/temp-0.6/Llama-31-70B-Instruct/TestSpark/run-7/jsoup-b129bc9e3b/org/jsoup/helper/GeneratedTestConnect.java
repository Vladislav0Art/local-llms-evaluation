package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class GeneratedTestConnect {

    private HttpConnection connection;

    @BeforeEach
    public void setUp() {
        connection = new HttpConnection();
    }

    @Test
    public void testConnect() {
        URL url = Mockito.mock(URL.class);
        when(url.getHost()).thenReturn("jsoup.org");

        Connection.Response response = connection.connect(url).execute();
        assertNotNull(response);
    }

}