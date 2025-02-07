package org.jsoup.helper;

public class GeneratedTestConnectCookieStore {

    @Mock
    private Request request;

    @Test
    public void testConnectCookieStore() {
        // Arrange
        CookieManager cookieManager = new DefaultCookieManager();
        HttpConnection connection = new HttpConnection(cookieManager);

        // Act
        Connection.Response response = connection.execute();

        // Assert
        assertEquals("HTTP/1.1 200 OK\r\nContent-Type: text/html; charset=UTF-8\r\n\r\n<html>\n</html>", response.getResponse());
    }

}