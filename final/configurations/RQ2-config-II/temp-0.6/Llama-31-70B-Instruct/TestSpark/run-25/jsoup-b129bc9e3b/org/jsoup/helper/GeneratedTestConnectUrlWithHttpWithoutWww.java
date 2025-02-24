package org.jsoup.helper;

public class GeneratedTestConnectUrlWithHttpWithoutWww {

    private HttpConnection httpConnection;

    @Before
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testConnectUrlWithHttpWithoutWww() {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

}