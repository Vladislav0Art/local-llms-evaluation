package org.jsoup.helper;

public class GeneratedTestConnectUrlWithHttp {

    private HttpConnection httpConnection;

    @Before
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testConnectUrlWithHttp() {
        String url = "http://www.example.com";
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

}