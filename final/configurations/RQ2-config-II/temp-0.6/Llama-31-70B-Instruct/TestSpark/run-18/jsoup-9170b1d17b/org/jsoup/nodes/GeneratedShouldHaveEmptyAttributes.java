package org.jsoup.nodes;

public class GeneratedShouldHaveEmptyAttributes {

    private Attributes attributes;

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