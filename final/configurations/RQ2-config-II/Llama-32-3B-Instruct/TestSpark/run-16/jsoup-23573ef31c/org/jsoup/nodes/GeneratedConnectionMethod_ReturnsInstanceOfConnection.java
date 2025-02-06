package org.jsoup.nodes;

public class GeneratedConnectionMethod_ReturnsInstanceOfConnection {

    @Test
    public void connectionMethod_ReturnsInstanceOfConnection() {
        Connection conn = Jsoup.connect("");
        Document doc = Document.createShell("");
        Connection result = doc.connection();
        assertNotNull(result);
        assertTrue(result instanceof Connection);
    }

}