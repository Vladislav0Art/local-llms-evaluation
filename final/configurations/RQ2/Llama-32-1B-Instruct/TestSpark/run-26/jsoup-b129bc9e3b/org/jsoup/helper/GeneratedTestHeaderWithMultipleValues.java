package org.jsoup.helper;

public class GeneratedTestHeaderWithMultipleValues {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testHeaderWithMultipleValues() throws IOException {
        String url = "https://www.example.com";
        Connection connection = httpConnection.connect(url);
        Map<String, String> headers = new LinkedHashMap<>();
        for (String key : headers.keySet()) {
            headers.put(key, value);
        }
        assertNotNull(headers);
    }

}