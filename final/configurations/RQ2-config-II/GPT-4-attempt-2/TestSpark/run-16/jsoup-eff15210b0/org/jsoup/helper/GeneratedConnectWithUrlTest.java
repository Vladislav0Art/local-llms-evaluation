package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;
import java.net.MalformedURLException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedConnectWithUrlTest {

    @Test
    public void connectWithUrlTest() throws MalformedURLException {
        Connection conn = HttpConnection.connect(new URL("http://example.com"));
        assertEquals(new URL("http://example.com"), conn.request().url());
    }

}