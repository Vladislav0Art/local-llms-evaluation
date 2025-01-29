package org.jsoup.helper;

public class GeneratedTestNewRequestMethod {

    private static final String URL = "https://example.com";
    private static final URL TEST_URL = new URL("http://example.com/test");

    @Before
    public void init() {
    }

    @Test
    public void testNewRequestMethod() throws IOException {
        Request request = new Request();
        HttpConnection connection = HttpConnection.newRequest(request);
        assertNotNull(connection);
        assertEquals(Request.class, connection.getClass());
    }

}