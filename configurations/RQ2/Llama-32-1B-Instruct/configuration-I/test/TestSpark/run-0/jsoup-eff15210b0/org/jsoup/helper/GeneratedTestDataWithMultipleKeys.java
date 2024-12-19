package org.jsoup.helper;

public class GeneratedTestDataWithMultipleKeys {

    private Connection connection;
    private URL url;

    @Test
    public void testDataWithMultipleKeys() {
        keyvals = new String[]{"key1", "key2"};
        connection = HttpConnection.connect();
        String body = connection.getData(keyvals);
        assertEquals("value1=value2", body);
    }

}