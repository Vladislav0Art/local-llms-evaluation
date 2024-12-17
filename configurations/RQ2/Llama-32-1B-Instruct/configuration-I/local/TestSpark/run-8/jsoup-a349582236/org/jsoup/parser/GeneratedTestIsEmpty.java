package org.jsoup.parser;

public class GeneratedTestIsEmpty {

    @Test
    public void testIsEmpty() {
        assertFalse(new TagImpl().isEmpty());
        assertTrue(new TagImpl("a").isEmpty());
    }

}