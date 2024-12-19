package org.jsoup.parser;

public class GeneratedTestIsFormSubmittable {

    @Test
    public void testIsFormSubmittable() {
        assertFalse(new TagImpl().isFormSubmittable());
        assertTrue(FormTag.class.isAssignableFrom(TagImpl.class));
    }

}