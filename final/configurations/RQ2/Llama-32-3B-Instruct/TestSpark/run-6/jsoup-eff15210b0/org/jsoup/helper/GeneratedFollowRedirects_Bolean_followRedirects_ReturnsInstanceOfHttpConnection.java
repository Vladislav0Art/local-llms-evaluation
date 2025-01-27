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

public class GeneratedFollowRedirects_Bolean_followRedirects_ReturnsInstanceOfHttpConnection {

    @Test
    public void followRedirects_Bolean_followRedirects_ReturnsInstanceOfHttpConnection() {
        boolean followRedirects = true;
        Connection connection = HttpConnection.followRedirects(followRedirects);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

}