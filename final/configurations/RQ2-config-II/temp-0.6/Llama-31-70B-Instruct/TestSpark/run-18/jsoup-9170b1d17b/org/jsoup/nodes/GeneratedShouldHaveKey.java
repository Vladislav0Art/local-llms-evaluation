package org.jsoup.nodes;

public class GeneratedShouldHaveKey {

    private Attributes attributes;

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

}