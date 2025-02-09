package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedHeaderTest {

    @Test
    public void headerTest() {
        HttpConnection connection = new HttpConnection();
        assertFalse(connection.request().hasHeader("Content-Type"));
        connection.header("Content-Type", "application/json");
        assertTrue(connection.request().hasHeader("Content-Type"));
    }

}