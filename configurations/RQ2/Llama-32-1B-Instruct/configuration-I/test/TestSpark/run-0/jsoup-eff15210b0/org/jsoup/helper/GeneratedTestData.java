package org.jsoup.helper;

public class GeneratedTestData {

    private Connection connection;
    private URL url;

    @Test
    public void testData() {
        data = "key1=value1&key2=value2";
        connection = HttpConnection.connect();
        String body = connection.getData(data);
        assertEquals("value1=value2", body);
    }

}