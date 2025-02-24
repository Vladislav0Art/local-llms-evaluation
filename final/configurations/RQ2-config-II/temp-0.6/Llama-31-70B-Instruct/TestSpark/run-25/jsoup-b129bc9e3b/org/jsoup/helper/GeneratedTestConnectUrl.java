package org.jsoup.helper;

public class GeneratedTestConnectUrl {

    private HttpConnection httpConnection;

    @Before
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testConnectUrl() {
        String url = "https://www.example.com";
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

}