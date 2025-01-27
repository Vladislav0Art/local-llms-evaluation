package org.jsoup.helper;

public class GeneratedDataMapStringValueTest {

    @Test
    public void dataMapStringValueTest() {
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection connection = HttpConnection.connect("https://example.com");
        Connection data2 = connection.data(data);
        assertNotNull(data2);
    }

}