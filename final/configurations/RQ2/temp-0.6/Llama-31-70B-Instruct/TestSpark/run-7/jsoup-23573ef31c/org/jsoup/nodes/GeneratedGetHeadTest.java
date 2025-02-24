package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetHeadTest {

    @Test
    public void getHeadTest() {
        // Arrange
        Document document = new Document("baseUri");

        // Act
        Element head = document.head();

        // Assert
        assertNotNull(head);
        assertEquals("head", head.tagName());
    }

}