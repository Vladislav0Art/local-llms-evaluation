package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedExecute_AcceptableResponse_ReturnsConnection {

    @Test
    public void execute_AcceptableResponse_ReturnsConnection() {
        Connection conn = new HttpConnection();
        Connection response = conn.execute();
        assertNotNull(response);
    }

}