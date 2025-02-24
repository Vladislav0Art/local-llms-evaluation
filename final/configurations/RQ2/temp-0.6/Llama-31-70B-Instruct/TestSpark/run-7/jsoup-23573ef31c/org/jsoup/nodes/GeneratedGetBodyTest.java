package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetBodyTest {

    @Test
    public void getBodyTest() {
        // Arrange
        Document document = new Document("baseUri");

        // Act
        Element body = document.body();

        // Assert
        assertNotNull(body);
        assertEquals("body", body.tagName());
    }

}