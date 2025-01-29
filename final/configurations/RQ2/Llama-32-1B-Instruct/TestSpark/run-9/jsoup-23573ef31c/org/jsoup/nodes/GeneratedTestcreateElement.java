package org.jsoup.nodes;

public class GeneratedTestcreateElement {

    private static Document document;

    @Before
    public void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testcreateElement() {
        Element element = document.createElement("test-element");
        assertNotNull(element);
    }

}