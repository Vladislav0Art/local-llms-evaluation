package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.DocumentType;
import org.jsoup.select.Elements;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTestConnection {

    @Test
    public void testConnection() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        Connection connection = document.connection();

        assertNotNull(connection);
    }

}