package org.jsoup.parser;

public class GeneratedTestIsFormSubmittable {

    @Test
    public void testIsFormSubmittable() {
        assertTrue(Tag.valueOf("input").isFormSubmittable());
        assertFalse(Tag.valueOf("div").isFormSubmittable());
    }

}