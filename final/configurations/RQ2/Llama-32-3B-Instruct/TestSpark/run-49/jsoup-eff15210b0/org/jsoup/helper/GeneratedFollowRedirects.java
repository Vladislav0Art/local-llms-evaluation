package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedFollowRedirects {

    @Test
    public void followRedirects() {
        boolean followRedirects = true;
        Connection connection = HttpConnection.followRedirects(followRedirects);
        assertEquals(boolean.class, connection.followRedirects().getClass());
        assertEquals(followRedirects, connection.followRedirects());
    }

}