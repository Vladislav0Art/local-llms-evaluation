package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.helper.HttpConnection;

public class GeneratedTestPost {

    @Test
    public void testPost() throws IOException {
        // Arrange
        HttpConnection httpConnection = new HttpConnection();

        // Act
        Document document = httpConnection.post();

        // Assert
        assertEquals(document.toString(), "expectedDocument");
    }

}