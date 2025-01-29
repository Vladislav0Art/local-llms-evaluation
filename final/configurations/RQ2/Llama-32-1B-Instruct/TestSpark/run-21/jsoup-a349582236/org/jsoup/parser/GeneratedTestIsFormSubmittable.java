package org.jsoup.parser;

public class GeneratedTestIsFormSubmittable {

    @Test
    public void testIsFormSubmittable() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("is_form_submittable", true);
        Tag tag = org.jsoup.parser.Tag.valueOf("form");
        assertTrue(tag.isFormSubmittable());
    }

}