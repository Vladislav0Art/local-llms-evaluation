package org.jsoup.nodes;

public class GeneratedTestConnectionNullConnection {

    @Test
    public void testConnectionNullConnection() {
        Connection connection = null;
        Document document = new Document("");
        try {
            document.connection(connection);
            assert false;
        } catch (NullPointerException e) {
            // expected
        }
    }

}