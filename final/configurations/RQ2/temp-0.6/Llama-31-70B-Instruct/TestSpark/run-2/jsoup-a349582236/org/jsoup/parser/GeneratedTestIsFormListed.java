package org.jsoup.parser;

public class GeneratedTestIsFormListed {

    @Test
    public void testIsFormListed() {
        assertTrue(Tag.valueOf("input").isFormListed());
        assertFalse(Tag.valueOf("div").isFormListed());
    }

}