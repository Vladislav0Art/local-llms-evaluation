package org.jsoup.helper;

public class GeneratedTestTimeout {

    private HttpConnection httpConnection;

    @BeforeEach
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testTimeout() {
        int timeout = 10000;
        httpConnection.timeout(timeout);
        assertEquals(timeout, httpConnection.timeout());
    }

}