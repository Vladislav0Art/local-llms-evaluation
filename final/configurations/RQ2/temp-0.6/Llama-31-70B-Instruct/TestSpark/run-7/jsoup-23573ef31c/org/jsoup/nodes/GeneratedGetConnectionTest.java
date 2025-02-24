package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetConnectionTest {

    @Test
    public void getConnectionTest() {
        // Arrange
        Document document = new Document("baseUri");

        // Act
        Connection connection = document.connection();

        // Assert
        assertNull(connection);
    }

}