package org.jsoup.helper;

public class GeneratedTestConnectUrlWithoutHttp {

    private HttpConnection httpConnection;

    @Before
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testConnectUrlWithoutHttp() {
        String url = "www.example.com";
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

}