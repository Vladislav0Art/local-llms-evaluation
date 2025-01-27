package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class GeneratedReferrer_String_referrer_ReturnsInstanceOfHttpConnection {

    @Test
    public void referrer_String_referrer_ReturnsInstanceOfHttpConnection() {
        String referrer = "example.com";
        Connection connection = HttpConnection.referrer(referrer);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

}