package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedHeaderStringAndValueReturnsNewConnection {

    @Test
    public void headerStringAndValueReturnsNewConnection() {
        String name = "name";
        String value = "value";
        Connection connection = new HttpConnection().header(name, value);
        assertNotNull(connection);
        // Note: we can't easily assert the actual URL returned by this method,
        // as it will depend on the implementation of HttpConnection.
    }

}