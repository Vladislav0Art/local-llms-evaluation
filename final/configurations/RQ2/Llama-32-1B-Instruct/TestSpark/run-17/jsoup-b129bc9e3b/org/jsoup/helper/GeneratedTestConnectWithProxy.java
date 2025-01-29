package org.jsoup.helper;

public class GeneratedTestConnectWithProxy {

    @Test
    public void testConnectWithProxy() throws MalformedURLException, URISyntaxException {
        // Arrange
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.example.com", 8080));
        Request request = new Request(Method.HEAD, new URL("http://example.com?proxy=1&proxyHost=proxy.example.com"));

        // Act
        try {
            Connection connection = HttpConnectionTest.connectWithProxy(request);

            // Assert
            assertNotNull(connection.getProxy());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (IOException e) {
                    // Ignore
                }
            }
        }
    }

}