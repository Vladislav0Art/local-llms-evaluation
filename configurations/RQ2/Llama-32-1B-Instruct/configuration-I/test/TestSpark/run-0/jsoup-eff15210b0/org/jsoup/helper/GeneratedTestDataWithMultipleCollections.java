package org.jsoup.helper;

public class GeneratedTestDataWithMultipleCollections {

    private Connection connection;
    private URL url;

    @Test
    public void testDataWithMultipleCollections() {
        data = new Collection<>() {{
            add(keyvals);
        }};
        connection = HttpConnection.connect();
        String body = connection.getData(data);
        assertEquals("value1=value2", body);
    }

}