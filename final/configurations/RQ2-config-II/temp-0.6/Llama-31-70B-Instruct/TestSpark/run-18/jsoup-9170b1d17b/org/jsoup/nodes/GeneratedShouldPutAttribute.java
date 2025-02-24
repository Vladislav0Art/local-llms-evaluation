package org.jsoup.nodes;

public class GeneratedShouldPutAttribute {

    private Attributes attributes;

    @Test
    public void shouldPutAttribute() {
        // given
        attributes = new Attributes();

        // when
        attributes.put("key", "value");

        // then
        assertEquals("value", attributes.get("key"));
    }

}