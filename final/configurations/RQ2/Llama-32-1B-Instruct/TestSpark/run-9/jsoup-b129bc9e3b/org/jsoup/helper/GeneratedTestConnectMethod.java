package org.jsoup.helper;

public class GeneratedTestConnectMethod {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testConnectMethod() throws IOException {
        Connection connection = new Connection();
        Assert.assertTrue(connection == httpConnection);
    }

}