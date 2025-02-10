package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Document;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedUserAgentSetsUserAgent {

    @Test
    public void userAgentSetsUserAgent() {
        String userAgent = "Mozilla/5.0";
        Connection connection = HttpConnection.userAgent(userAgent);
        assertEquals(userAgent, connection.userAgent());
    }

}