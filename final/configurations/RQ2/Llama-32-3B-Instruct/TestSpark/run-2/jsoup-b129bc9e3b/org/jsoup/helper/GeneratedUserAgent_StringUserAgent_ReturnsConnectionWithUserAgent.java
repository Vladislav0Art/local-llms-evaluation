package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedUserAgent_StringUserAgent_ReturnsConnectionWithUserAgent {

    @Test
    public void userAgent_StringUserAgent_ReturnsConnectionWithUserAgent() {
        String userAgent = "Mozilla/5.0";
        Connection connection = HttpConnection.userAgent(userAgent);
        assertNotNull(connection);
    }

}