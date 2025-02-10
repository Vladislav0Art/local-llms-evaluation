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

public class GeneratedUserAgent {

    @Test
    public void userAgent() {
        String userAgent = "Mozilla/5.0";
        Connection connection = HttpConnection.userAgent(userAgent);
        assertEquals(String.class, connection.userAgent().getClass());
        assertEquals(userAgent, connection.userAgent().get());
    }

}