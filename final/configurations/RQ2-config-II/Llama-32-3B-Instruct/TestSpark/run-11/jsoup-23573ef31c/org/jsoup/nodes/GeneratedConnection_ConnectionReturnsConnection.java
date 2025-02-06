package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class GeneratedConnection_ConnectionReturnsConnection {

    @Test
    public void connection_ConnectionReturnsConnection() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        assertEquals(connection, document.connection());
    }

}