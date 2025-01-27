package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedHeadersMapReturnsNewConnection {

    @Test
    public void headersMapReturnsNewConnection() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "value");
        Connection connection = new HttpConnection().headers(map);
        assertNotNull(connection);
        // Note: we can't easily assert the actual URL returned by this method,
        // as it will depend on the implementation of HttpConnection.
    }

}