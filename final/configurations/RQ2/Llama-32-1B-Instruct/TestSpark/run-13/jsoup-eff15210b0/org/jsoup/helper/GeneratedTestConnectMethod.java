package org.jsoup.helper;

public class GeneratedTestConnectMethod {

    private static final String URL = "https://example.com";
    private static final URL TEST_URL = new URL("http://example.com/test");

    @Before
    public void init() {
    }

    @Test
    public void testConnectMethod() throws IOException {
        HttpConnection connection = HttpConnection.connect(TEST_URL);
        assertEquals(HEAD, connection.getHttpMethod());
    }

}