package org.jsoup.nodes;

public class GeneratedShouldAddAttribute {

    private Attributes attributes;

    @Test
    public void shouldAddAttribute() {
        // given
        attributes = new Attributes();

        // when
        attributes.add("key", "value");

        // then
        assertEquals("value", attributes.get("key"));
    }

}