package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedUrlMethodSetsUrlAsString {

    @Test
    public void urlMethodSetsUrlAsString() {
        Connection connection = HttpConnection.url("http://www.example.com", 80);
        assertEquals("http://www.example.com", connection.url().getHost());
    }

}