package org.jsoup.parser;

public class GeneratedTestIsFormListed {

    @Test
    public void testIsFormListed() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("is_form_listed", false);
        Tag tag = org.jsoup.parser.Tag.valueOf("form");
        assertFalse(tag.isFormListed());
    }

}