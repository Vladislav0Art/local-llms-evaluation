package org.jsoup.helper;

public class GeneratedTestConnectWithUrl {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testConnectWithUrl() throws IOException {
        String url = "https://www.example.com";
        Connection connection = httpConnection.connect(url);
        assertNotNull(connection);
    }

}