package org.jsoup.helper;

public class GeneratedTestConnectSuccess {

    @Mock
    private Request request;

    @Test
    public void testConnectSuccess() {
        // Arrange
        URL url = new URL("https://www.example.com");
        String response = "HTTP/1.1 200 OK\r\nContent-Type: text/html; charset=UTF-8\r\n\r\n<html>\n</html>";
        HttpConnection connection = new HttpConnection();
        when(connection.connect(url)).thenReturn(new Response(response));

        // Act
        Connection.Response responseResult = connection.execute();

        // Assert
        assertEquals("HTTP/1.1 200 OK\r\nContent-Type: text/html; charset=UTF-8\r\n\r\n<html>\n</html>", responseResult.getResponse());
    }

}