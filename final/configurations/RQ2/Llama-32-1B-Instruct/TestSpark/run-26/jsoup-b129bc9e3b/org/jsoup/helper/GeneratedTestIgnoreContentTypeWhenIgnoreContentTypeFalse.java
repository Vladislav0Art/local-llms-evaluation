package org.jsoup.helper;

public class GeneratedTestIgnoreContentTypeWhenIgnoreContentTypeFalse {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testIgnoreContentTypeWhenIgnoreContentTypeFalse() throws MalformedURLException, URISyntaxException {
        String url = "https://www.example.com";
        String contentType = "text/html";
        Connection connection = httpConnection.connect(url);
        connection.ignoreContentType(false);
        connection.ignoreContentType(contentType);
        assertNotNull(connection);
    }

}