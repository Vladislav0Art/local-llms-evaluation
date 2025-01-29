package org.jsoup.helper;

public class GeneratedTestPostWithKeyVal {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testPostWithKeyVal() throws IOException {
        String key = "key";
        String value = "value";
        Connection connection = httpConnection.connect("https://www.example.com");
        Connection request = connection.request(Request.POST, key, value);
        assertNotNull(request);
        assertEquals(POST, request.method());
    }

}