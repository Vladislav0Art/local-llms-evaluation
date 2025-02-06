package org.jsoup.nodes;

public class GeneratedTestConnectionValidConnection {

    @Test
    public void testConnectionValidConnection() {
        Connection connection = new Connection();
        Document document = new Document("");
        document.connection(connection);
        assertNotNull(document.connection());
    }

}