package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest {

    @Test
    public void testGet() throws IOException {
        // Arrange
        HttpConnection httpConnection = new HttpConnection();

        // Act
        Document document = httpConnection.get();

        // Assert
        assertEquals(document.toString(), "expectedDocument");
    }

    @Test
    public void testPost() throws IOException {
        // Arrange
        HttpConnection httpConnection = new HttpConnection();

        // Act
        Document document = httpConnection.post();

        // Assert
        assertEquals(document.toString(), "expectedDocument");
    }

    @Test
    public void testExecute() throws IOException {
        // Arrange
        HttpConnection httpConnection = new HttpConnection();

        // Act
        Connection.Response response = httpConnection.execute();

        // Assert
        assertEquals(response.toString(), "expectedResponse");
    }

}