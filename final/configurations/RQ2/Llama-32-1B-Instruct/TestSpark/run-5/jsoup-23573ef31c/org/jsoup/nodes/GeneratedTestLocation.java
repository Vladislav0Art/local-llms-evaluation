package org.jsoup.nodes;

public class GeneratedTestLocation {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testLocation() {
        assertEquals("http://example.com", document.location());
    }

}