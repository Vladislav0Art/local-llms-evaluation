package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedConnect_url_throws_new_exception_with_http_error_code_and_message_and_response_body_and_ignore_http_errors {

    @BeforeEach
    public void init() {
        TestMockHttpConnection.mockConnection = Mockito.mock(Connection.class);
    }

    @Test
    public void connect_url_throws_new_exception_with_http_error_code_and_message_and_response_body_and_ignore_http_errors() {
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

        Response response = mockHttpConnection.response(url, "path", null);

        boolean ignoreHttpErrors = true;

        Response ignoredResponse = mockHttpConnection.ignored(response);

        assertEquals(expectedCode, ignoredResponse.getCode());
        assertEquals(expectedMessage, ignoredResponse.getMessage());
    }

}