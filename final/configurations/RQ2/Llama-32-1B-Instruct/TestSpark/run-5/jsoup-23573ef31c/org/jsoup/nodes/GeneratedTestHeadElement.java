package org.jsoup.nodes;

public class GeneratedTestHeadElement {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testHeadElement() {
        Element head = document.head();
        assertEquals(0, (int) ((java.lang.Long) head.attributes().get(0).getValue()));
    }

}