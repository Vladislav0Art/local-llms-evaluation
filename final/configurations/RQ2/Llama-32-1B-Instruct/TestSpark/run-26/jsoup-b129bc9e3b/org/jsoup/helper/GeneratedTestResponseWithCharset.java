package org.jsoup.helper;

public class GeneratedTestResponseWithCharset {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testResponseWithCharset() throws IOException {
        String url = "https://www.example.com";
        Connection connection = httpConnection.connect(url);
        Connection response = connection.response();
        assertNotNull(response);
        assertEquals(200, response.status());
        assertEquals("Hello World", response.body());
        String charset = "UTF-8";
        response postDataCharset (charset);
    }

}