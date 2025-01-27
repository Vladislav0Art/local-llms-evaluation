package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedConnection_returnsConnectionObject {

    @Test
    public void connection_returnsConnectionObject() {
        Connection connection = Jsoup.connect("https://example.com");
        Document document = Document.createShell(connection.url());
        assertEquals(connection, document.connection());
    }

}