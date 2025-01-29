package org.jsoup.helper;

public class GeneratedTestMethodWithUrl {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testMethodWithUrl() throws URISyntaxException, IOException {
        String url = "https://www.example.com";
        Connection connection = httpConnection.connect(url);
        Method method = connection.method(Method.HEAD);
        assertNotNull(method);
        assertEquals(HEAD, method);
    }

}