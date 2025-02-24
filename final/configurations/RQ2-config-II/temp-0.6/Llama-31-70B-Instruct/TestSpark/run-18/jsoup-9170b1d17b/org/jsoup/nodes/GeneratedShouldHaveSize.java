package org.jsoup.nodes;

public class GeneratedShouldHaveSize {

    private Attributes attributes;

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

}