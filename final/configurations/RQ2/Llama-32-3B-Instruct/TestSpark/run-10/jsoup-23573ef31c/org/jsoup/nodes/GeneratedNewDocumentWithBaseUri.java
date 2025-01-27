package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.nio.charset.Charset;

public class GeneratedNewDocumentWithBaseUri {

    public static class Connection {
        public String getUri() {
            return "http://example.com";
        }
    }

    @Test
    public void newDocumentWithBaseUri() {
        Connection connection = new Connection();
        Document document = Document.createShell(connection.getUri());
        assertNotNull(document);
    }

}