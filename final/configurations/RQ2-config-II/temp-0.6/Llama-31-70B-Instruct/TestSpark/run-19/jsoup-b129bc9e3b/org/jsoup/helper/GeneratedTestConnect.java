package org.jsoup.helper;

public class GeneratedTestConnect {

    private HttpConnection httpConnection;

    @BeforeEach
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testConnect() throws IOException {
        String url = "http://www.example.com/";
        URL expectedUrl = new URL(url);
        HttpConnection connection = HttpConnection.connect(url);
        assertEquals(expectedUrl, connection.url());
    }

}