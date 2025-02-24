package org.jsoup.nodes;

public class GeneratedTest {

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

    @Test
    public void shouldPutAttribute() {
        // given
        attributes = new Attributes();

        // when
        attributes.put("key", "value");

        // then
        assertEquals("value", attributes.get("key"));
    }

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

    @Test
    public void shouldHaveKey() {
        // given
        attributes = new Attributes();
        attributes.put("key", "value");

        // when
        boolean hasKey = attributes.hasKey("key");

        // then
        assertTrue(hasKey);
    }

    @Test
    public void shouldHaveSize() {
        // given
        attributes = new Attributes();
        attributes.put("key", "value");

        // when
        int size = attributes.size();

        // then
        assertEquals(1, size);
    }

    @Test
    public void shouldHaveEmptyAttributes() {
        // given
        attributes = new Attributes();

        // when
        boolean isEmpty = attributes.isEmpty();

        // then
        assertTrue(isEmpty);
    }

}