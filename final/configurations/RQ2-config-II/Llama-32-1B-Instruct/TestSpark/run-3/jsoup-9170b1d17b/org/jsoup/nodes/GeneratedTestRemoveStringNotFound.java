package org.jsoup.nodes;

public class GeneratedTestRemoveStringNotFound {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        this.attributes = new Attributes();
    }

    @Test
    public void testRemoveStringNotFound() {
        String key = "test";
        assertEquals(0, attributes.size());
    }

}