package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetLocationTest {

    @Test
    public void getLocationTest() {
        // Arrange
        Document document = new Document("baseUri");

        // Act
        String location = document.location();

        // Assert
        assertEquals("baseUri", location);
    }

}