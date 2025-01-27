package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedConnectionReturnsCorrectConnection {

    @Test
    public void connectionReturnsCorrectConnection() {
        String baseUri = "https://example.com";
        Connection conn = new Connection();
        Document doc = Document.createShell(baseUri).connection(conn);
        assertNotNull(doc.connection());
    }

}