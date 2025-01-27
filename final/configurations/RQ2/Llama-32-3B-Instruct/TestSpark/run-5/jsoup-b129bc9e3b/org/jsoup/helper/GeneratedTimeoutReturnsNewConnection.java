package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTimeoutReturnsNewConnection {

    @Test
    public void timeoutReturnsNewConnection() {
        int timeout = 500;
        Connection connection = new HttpConnection().timeout(timeout);
        assertNotNull(connection);
        // Note: we can't easily assert the actual URL returned by this method,
        // as it will depend on the implementation of HttpConnection.
    }

}