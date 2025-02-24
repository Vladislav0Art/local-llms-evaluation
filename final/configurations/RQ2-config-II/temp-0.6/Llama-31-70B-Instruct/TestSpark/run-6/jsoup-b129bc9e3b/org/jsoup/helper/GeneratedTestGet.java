package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.helper.HttpConnection;

public class GeneratedTestGet {

    @Test
    public void testGet() throws IOException {
        // Arrange
        HttpConnection httpConnection = new HttpConnection();

        // Act
        Document document = httpConnection.get();

        // Assert
        assertEquals(document.toString(), "expectedDocument");
    }

}