package org.jsoup.helper;

public class GeneratedTestConnectUrlWithHttpsWithoutWww {

    private HttpConnection httpConnection;

    @Before
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testConnectUrlWithHttpsWithoutWww() {
        String url = "https://example.com";
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

}