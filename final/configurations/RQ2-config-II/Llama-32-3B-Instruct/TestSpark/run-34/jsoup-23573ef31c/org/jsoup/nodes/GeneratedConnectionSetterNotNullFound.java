package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class GeneratedConnectionSetterNotNullFound {

    @Test
    public void connectionSetterNotNullFound() {
        Connection connection = Jsoup.connect("http://example.com");
        Document document = Document.createShell(connection.getUri());
        document.connection(connection);
        assertNotNull(document.connection());
    }

}