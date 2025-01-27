package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedRequest_ReturnsRequest {

    @Test
    public void request_ReturnsRequest() {
        Connection.Request request = new Connection.Request();
        Connection connection = HttpConnection.request(request);
        assertNotNull(connection);
    }

}