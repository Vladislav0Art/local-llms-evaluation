package org.jsoup.helper;

public class GeneratedTestPostWithKeyVals {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testPostWithKeyVals() throws IOException {
        String[] keyvals = {"key1", "key2"};
        Connection connection = httpConnection.connect("https://www.example.com");
        Map<String, String> data = new LinkedHashMap<>();
        for (String keyval : keyvals) {
            data.put(keyval, value);
        }
        Connection request = connection.request(Request.POST, null, data);
        assertNotNull(request);
    }

}