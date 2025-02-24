package org.jsoup.helper;

public class GeneratedTestUrl {

    private HttpConnection httpConnection;

    @BeforeEach
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testUrl() {
        String url = "http://www.example.com/";
        URL expectedUrl = new URL(url);
        httpConnection.url(url);
        assertEquals(expectedUrl, httpConnection.url());
    }

}