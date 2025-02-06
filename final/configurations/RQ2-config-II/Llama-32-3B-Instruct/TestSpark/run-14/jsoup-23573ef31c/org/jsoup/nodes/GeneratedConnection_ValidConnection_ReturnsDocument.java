package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedConnection_ValidConnection_ReturnsDocument {

    @Test
    public void connection_ValidConnection_ReturnsDocument() {
        Connection connection = Jsoup.connect("https://example.com");
        Document document = Document.connection(connection);
        assertNotNull(document);
        assertEquals(connection.url(), document.location());
    }

}