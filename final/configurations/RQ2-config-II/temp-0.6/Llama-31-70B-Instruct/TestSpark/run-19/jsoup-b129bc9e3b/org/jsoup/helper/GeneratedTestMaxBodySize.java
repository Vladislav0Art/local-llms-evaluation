package org.jsoup.helper;

public class GeneratedTestMaxBodySize {

    private HttpConnection httpConnection;

    @BeforeEach
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testMaxBodySize() {
        int maxBodySize = 1024;
        httpConnection.maxBodySize(maxBodySize);
        assertEquals(maxBodySize, httpConnection.maxBodySize());
    }

}