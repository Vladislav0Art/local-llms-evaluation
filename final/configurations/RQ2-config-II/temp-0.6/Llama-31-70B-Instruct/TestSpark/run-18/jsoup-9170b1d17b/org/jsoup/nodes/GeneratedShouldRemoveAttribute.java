package org.jsoup.nodes;

public class GeneratedShouldRemoveAttribute {

    private Attributes attributes;

    @Test
    public void shouldRemoveAttribute() {
        // given
        attributes = new Attributes();
        attributes.put("key", "value");

        // when
        attributes.remove("key");

        // then
        assertNull(attributes.get("key"));
    }

}