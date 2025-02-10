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

public class GeneratedReferrer {

    @Test
    public void referrer() {
        String referrer = "https://www.example.com";
        Connection connection = HttpConnection.referrer(referrer);
        assertEquals(String.class, connection.referrer().getClass());
        assertEquals(referrer, connection.referrer());
    }

}