package org.jsoup.helper;

public class GeneratedTestConnectWithUrlEncoded {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testConnectWithUrlEncoded() throws IOException {
        URL encodedUrl = new URL("https://www.example.com");
        Connection connection = httpConnection.connect(encodedUrl);
        assertNotNull(connection);
    }

}