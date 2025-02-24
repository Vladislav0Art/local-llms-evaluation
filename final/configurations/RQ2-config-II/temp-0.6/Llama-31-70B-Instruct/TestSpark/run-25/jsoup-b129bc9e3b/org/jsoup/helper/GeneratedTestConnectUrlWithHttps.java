package org.jsoup.helper;

public class GeneratedTestConnectUrlWithHttps {

    private HttpConnection httpConnection;

    @Before
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testConnectUrlWithHttps() {
        String url = "https://www.example.com";
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

}