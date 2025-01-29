package org.jsoup.helper;

public class GeneratedTestPostWithKeyValSet {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testPostWithKeyValSet() throws IOException {
        String[] keyvals = {"key1", "key2"};
        Connection connection = httpConnection.connect("https://www.example.com");
        Map<String, String> data = new LinkedHashMap<>();
        for (String keyval : keyvals) {
            data.put(keyval, value);
        }
        Connection request = connection.request(Request.POST, null, null, null, null, null, null);
        assertNotNull(request);
    }

}