package org.jsoup.nodes;

public class GeneratedTestConnectionClone {

    @Test
    public void testConnectionClone() {
        Connection connection = new Connection();
        Document document = new Document();
        document.connection(connection.clone());
        Assert.assertEquals(connection, document.connection());
    }

}