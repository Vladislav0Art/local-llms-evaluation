package org.jsoup.helper;

public class GeneratedTestDataWithKeyVal {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testDataWithKeyVal() throws IOException {
        String key = "key";
        String value = "value";
        String filename = "example.txt";
        InputStream inputStream = new ByteArrayInputStream("Hello World".getBytes());
        Connection connection = httpConnection.connect("https://www.example.com", data(key, value));
        assertNotNull(connection);
    }

}