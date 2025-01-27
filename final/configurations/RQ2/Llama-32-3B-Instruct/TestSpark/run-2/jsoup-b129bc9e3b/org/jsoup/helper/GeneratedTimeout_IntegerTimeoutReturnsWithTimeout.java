package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedTimeout_IntegerTimeoutReturnsWithTimeout {

    @Test
    public void timeout_IntegerTimeoutReturnsWithTimeout() {
        int millis = 1000;
        Connection connection = HttpConnection.timeout(millis);
        assertNotNull(connection);
    }

}