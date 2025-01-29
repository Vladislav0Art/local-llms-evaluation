package org.jsoup.nodes;

public class GeneratedConnection {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void connection() throws Exception {
        Document doc = createDocument(BASE_URI);
        Connection conn = doc.connection();
        assertNotNull(conn);
    }

}