package org.jsoup.helper;

public class GeneratedTestUserAgent {

    private HttpConnection httpConnection;

    @BeforeEach
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testUserAgent() {
        String userAgent = "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0";
        httpConnection.userAgent(userAgent);
        assertEquals(userAgent, httpConnection.userAgent());
    }

}