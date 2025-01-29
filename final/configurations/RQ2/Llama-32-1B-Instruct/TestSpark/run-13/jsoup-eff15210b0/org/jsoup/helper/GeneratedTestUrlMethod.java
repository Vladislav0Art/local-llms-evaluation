package org.jsoup.helper;

public class GeneratedTestUrlMethod {

    private static final String URL = "https://example.com";
    private static final URL TEST_URL = new URL("http://example.com/test");

    @Before
    public void init() {
    }

    @Test
    public void testUrlMethod() throws IOException {
        HttpConnection connection = HttpConnection.connect(URL);
        assertNotNull(connection);
        assertEquals(URL, connection.getUrl());
    }

}