package org.jsoup.helper;

public class GeneratedTestDataWithMultipleValues {

    private Connection connection;
    private URL url;

    @Test
    public void testDataWithMultipleValues() {
        data = "{\"key1\":\"value1\",\"key2\":\"value2\"}";
        connection = HttpConnection.connect();
        String body = connection.getData(data);
        assertEquals("{\"key1\":\"value1\",\"key2\":\"value2\"}", body);
    }

}