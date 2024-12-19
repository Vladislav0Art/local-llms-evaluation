package org.jsoup.helper;

public class GeneratedTestDataWithMultipleArrays {

    private Connection connection;
    private URL url;

    @Test
    public void testDataWithMultipleArrays() {
        data = new String[]{"key1", "key2"};
        connection = HttpConnection.connect();
        String body = connection.getData(data);
        assertEquals("value1=value2", body);
    }

}