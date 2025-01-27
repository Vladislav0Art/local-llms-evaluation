package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.nio.charset.Charset;

public class GeneratedConnectionReturnsConnection {

    public static class Connection {
        public String getUri() {
            return "http://example.com";
        }
    }

    @Test
    public void connectionReturnsConnection() {
        Connection connection = new Connection();
        Document document = Document.createShell(connection.getUri());
        assertEquals(connection, document.connection());
    }

}