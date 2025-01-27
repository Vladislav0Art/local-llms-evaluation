package org.jsoup.nodes;

public class GeneratedConnection_test {

    @Test
    public void connection_test() {
        Connection connection = mock(Connection.class);
        when(connection.connect()).thenReturn(true);
        Document document = new Document("http://example.com");
        Document document2 = document.connection(connection);
        assertNotNull(document2);
    }

}