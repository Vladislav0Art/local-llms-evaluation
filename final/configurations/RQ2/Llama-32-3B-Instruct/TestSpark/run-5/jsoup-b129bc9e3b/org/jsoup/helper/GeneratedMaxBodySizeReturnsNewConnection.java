package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedMaxBodySizeReturnsNewConnection {

    @Test
    public void maxBodySizeReturnsNewConnection() {
        int maxSize = 1024;
        Connection connection = new HttpConnection().maxBodySize(maxSize);
        assertNotNull(connection);
        // Note: we can't easily assert the actual URL returned by this method,
        // as it will depend on the implementation of HttpConnection.
    }

}