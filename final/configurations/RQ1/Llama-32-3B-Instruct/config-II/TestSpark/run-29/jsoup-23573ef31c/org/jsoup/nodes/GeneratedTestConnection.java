package org.jsoup.nodes;

public class GeneratedTestConnection {

    @Test
    public void testConnection() {
        Document document = new Document();
        Connection connection = new Connection();
        document.connection(connection);
        Assert.assertEquals(connection, document.connection());
    }
}

}