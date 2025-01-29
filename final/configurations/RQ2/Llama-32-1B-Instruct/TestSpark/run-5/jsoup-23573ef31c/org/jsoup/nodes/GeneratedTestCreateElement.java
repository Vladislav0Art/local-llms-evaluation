package org.jsoup.nodes;

public class GeneratedTestCreateElement {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testCreateElement() {
        Element element = new Document(document).createElement("div");
        assertEquals(1, (int) ((java.lang.Long) element.attributes().size()));
    }
}

class FormElementTests {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com/form");
    }

}