package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConnectUrlReturnsNewConnection {

    @Test
    public void connectUrlReturnsNewConnection() {
        String url = "https://www.example.com";
        Connection connection = new HttpConnection().connect(url);
        assertNotNull(connection);
        assertEquals(url, ((HttpConnection) connection).getUrl());
    }

}