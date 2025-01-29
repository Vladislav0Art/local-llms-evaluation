package org.jsoup.helper;

public class GeneratedTestGetHeadersWithMultipleNames {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testGetHeadersWithMultipleNames() throws IOException {
        String url = "https://www.example.com";
        Connection connection = httpConnection.connect(url);
        Map<String, Object> headers = new LinkedHashMap<>();
        for (String key : headers.keySet()) {
            headers.put(key, value);
        }
        assertNotNull(headers.get("X-Angular-Header"));
    }

}