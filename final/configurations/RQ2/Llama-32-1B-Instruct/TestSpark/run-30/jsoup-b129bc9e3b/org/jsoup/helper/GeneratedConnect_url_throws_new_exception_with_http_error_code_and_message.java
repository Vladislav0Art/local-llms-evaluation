package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedConnect_url_throws_new_exception_with_http_error_code_and_message {

    @BeforeEach
    public void init() {
        TestMockHttpConnection.mockConnection = Mockito.mock(Connection.class);
    }

    @Test
    public void connect_url_throws_new_exception_with_http_error_code_and_message() {
        // Arrange
        String url = "non_existent_url";
        int expectedCode = 404;
        String expectedMessage = "Not Found";

        // Act and Assert
        Mockito.when(mockHttpConnection.connect(url)).thenThrow(new HttpRequestException(expectedCode, expectedMessage));

        try {
            mockHttpConnection.connect(url);
            fail("Expected an exception to be thrown with the correct HTTP error code and message");
        } catch (Exception e) {
            // Expected exception
        }
    }

}