package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConnectURLReturnsNewConnection {

    @Test
    public void connectURLReturnsNewConnection() throws MalformedURLException, URISyntaxException {
        URL url = new URL("https://www.example.com");
        Connection connection = new HttpConnection().connect(url);
        assertNotNull(connection);
        assertEquals(url.toString(), ((HttpConnection) connection).getUrl());
    }

}