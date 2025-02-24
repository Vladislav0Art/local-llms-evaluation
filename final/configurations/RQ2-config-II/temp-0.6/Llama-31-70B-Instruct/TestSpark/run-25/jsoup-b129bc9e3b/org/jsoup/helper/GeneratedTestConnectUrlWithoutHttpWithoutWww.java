package org.jsoup.helper;

public class GeneratedTestConnectUrlWithoutHttpWithoutWww {

    private HttpConnection httpConnection;

    @Before
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testConnectUrlWithoutHttpWithoutWww() {
        String url = "example.com";
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

}