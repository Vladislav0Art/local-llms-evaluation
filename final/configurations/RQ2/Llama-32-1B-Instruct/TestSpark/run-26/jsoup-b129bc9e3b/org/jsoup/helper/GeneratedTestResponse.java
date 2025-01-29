package org.jsoup.helper;

public class GeneratedTestResponse {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testResponse() throws IOException {
        String url = "https://www.example.com";
        Connection connection = httpConnection.connect(url);
        Connection response = connection.execute();
        assertEquals(200, response.status());
        assertEquals("Hello World", response.body());
    }

}