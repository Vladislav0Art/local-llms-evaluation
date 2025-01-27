package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedConnection_InvalidConnection {

    @Test
    public void connection_InvalidConnection() {
        Connection connection = null;
        Document document = Document.createShell("https://example.com");
        try {
            document.connection(connection);
            fail("Expected exception");
        } catch (NullPointerException e) {
            // expected
        }
    }

}