package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedFollowRedirects_BoolFollowRedirects_ReturnsConnectionWithFollowRedirects {

    @Test
    public void followRedirects_BoolFollowRedirects_ReturnsConnectionWithFollowRedirects() {
        boolean followRedirects = true;
        Connection connection = HttpConnection.followRedirects(followRedirects);
        assertNotNull(connection);
    }

}