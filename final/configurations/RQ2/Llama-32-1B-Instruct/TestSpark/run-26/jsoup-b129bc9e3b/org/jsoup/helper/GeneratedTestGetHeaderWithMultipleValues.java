package org.jsoup.helper;

public class GeneratedTestGetHeaderWithMultipleValues {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testGetHeaderWithMultipleValues() throws IOException {
        String url = "https://www.example.com";
        Connection connection = httpConnection.connect(url);
        Map<String, Object> headers = new LinkedHashMap<>();
        for (String key : headers.keySet()) {
            headers.put(key, value);
        }
        assertNotNull(headers.get("X-Angular-Header"));
    }

}