package org.jsoup.nodes;

public class GeneratedTest_getConnection {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void test_getConnection() {
        Connection connection = new Connection(BASE_URI);
        Document document = new Document(BASE_URI);
        document.setConnection(connection);
        assertEquals(connection, document.connection());
    }

}