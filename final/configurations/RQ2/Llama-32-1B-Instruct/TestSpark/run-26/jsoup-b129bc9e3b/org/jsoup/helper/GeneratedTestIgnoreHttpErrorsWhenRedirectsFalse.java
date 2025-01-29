package org.jsoup.helper;

public class GeneratedTestIgnoreHttpErrorsWhenRedirectsFalse {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testIgnoreHttpErrorsWhenRedirectsFalse() throws IOException {
        String url = "https://www.example.com";
        Connection connection = httpConnection.connect(url);
        connection.ignoreHttpErrors(false);
        connection.followRedirects(false);
        assertNotNull(connection);
    }

}