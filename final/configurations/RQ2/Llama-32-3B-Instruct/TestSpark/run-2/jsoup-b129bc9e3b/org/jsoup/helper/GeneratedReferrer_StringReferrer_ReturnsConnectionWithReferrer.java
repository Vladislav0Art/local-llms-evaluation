package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedReferrer_StringReferrer_ReturnsConnectionWithReferrer {

    @Test
    public void referrer_StringReferrer_ReturnsConnectionWithReferrer() {
        String referrer = "http://example.com";
        Connection connection = HttpConnection.referrer(referrer);
        assertNotNull(connection);
    }

}