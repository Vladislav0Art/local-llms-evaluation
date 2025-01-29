package org.jsoup.nodes;

public class GeneratedTestConnection {

    @Test
    public void testConnection() {
        Document document = new Document();
        Connection connection = org.jsoup.Connection.get("https://example.com", ParseSettings.defaultParser());
        assertNotNull(connection);
    }

}