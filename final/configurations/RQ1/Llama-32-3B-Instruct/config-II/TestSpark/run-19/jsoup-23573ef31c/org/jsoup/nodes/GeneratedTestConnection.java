package org.jsoup.nodes;

public class GeneratedTestConnection {

    @Test
    public void testConnection() {
        Connection connection = new Connection();
        Document document = new Document();
        Assert.assertNull(document.connection());
        document.connection(connection);
        Assert.assertEquals(connection, document.connection());
    }

}