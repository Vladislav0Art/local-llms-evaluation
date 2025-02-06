package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedConnectionDocumentTest {

    @Test
    public void connectionDocumentTest() {
        Document document = new Document("http://example.com");
        Connection connection = document.connection();
        assertNotNull(connection);
    }

}