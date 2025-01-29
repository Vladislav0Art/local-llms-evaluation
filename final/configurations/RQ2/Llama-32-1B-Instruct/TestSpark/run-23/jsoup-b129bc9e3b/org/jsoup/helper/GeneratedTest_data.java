package org.jsoup.helper;

public class GeneratedTest_data {

    private static final String HOST = "example.com";
    private static final int PORT = 443;

    @Test
    public void test_data() {
        Document document = new Document();
        // create content
        String body = "Hello World!";
        Connection connection = HttpConnection.connect(new URL("https://www.example.com"));
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        connection.data(data);
        assertEquals(body, ((HttpConnection) connection).data("body").getValue());
    }

}