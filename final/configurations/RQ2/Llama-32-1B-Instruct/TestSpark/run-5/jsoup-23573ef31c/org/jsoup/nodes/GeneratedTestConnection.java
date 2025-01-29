package org.jsoup.nodes;

public class GeneratedTestConnection {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testConnection() {
        assertEquals(null, document.connection().toString());
    }

}