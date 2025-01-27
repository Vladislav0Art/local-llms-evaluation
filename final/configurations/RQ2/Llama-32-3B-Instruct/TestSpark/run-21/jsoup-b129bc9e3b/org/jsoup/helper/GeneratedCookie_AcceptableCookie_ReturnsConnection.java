package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedCookie_AcceptableCookie_ReturnsConnection {

    @Test
    public void cookie_AcceptableCookie_ReturnsConnection() {
        Connection conn = Connection.cookie("name=value");
        assertNotNull(conn);
    }
}

}