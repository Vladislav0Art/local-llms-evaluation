package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws IOException {
        // Arrange
        HttpConnection httpConnection = new HttpConnection();
        // Act
        Response response = httpConnection.execute();
        // Assert
        assertNotNull(response);
    }

}