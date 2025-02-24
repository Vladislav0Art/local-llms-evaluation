package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.helper.HttpConnection;

public class GeneratedTestExecute {

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