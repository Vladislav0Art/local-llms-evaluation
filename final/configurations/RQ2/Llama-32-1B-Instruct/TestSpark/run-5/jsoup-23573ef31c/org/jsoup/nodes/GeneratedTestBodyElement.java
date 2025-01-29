package org.jsoup.nodes;

public class GeneratedTestBodyElement {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testBodyElement() {
        Element body = document.body();
        assertEquals(1, (int) ((java.lang.Long) body.attributes().size()));
    }

}