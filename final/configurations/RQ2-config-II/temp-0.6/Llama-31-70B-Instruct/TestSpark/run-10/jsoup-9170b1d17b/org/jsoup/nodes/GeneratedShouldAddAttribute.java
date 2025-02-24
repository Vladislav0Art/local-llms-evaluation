package org.jsoup.nodes;

public class GeneratedShouldAddAttribute {

    @Test
    public void shouldAddAttribute() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals(1, attributes.size());
    }

}