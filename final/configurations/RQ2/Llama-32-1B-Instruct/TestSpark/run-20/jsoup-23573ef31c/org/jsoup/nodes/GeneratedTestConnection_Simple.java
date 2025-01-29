package org.jsoup.nodes;

public class GeneratedTestConnection_Simple {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void testConnection_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        Connection connection = document.connection();
        Assert.assertNotNull(connection);
    }

}