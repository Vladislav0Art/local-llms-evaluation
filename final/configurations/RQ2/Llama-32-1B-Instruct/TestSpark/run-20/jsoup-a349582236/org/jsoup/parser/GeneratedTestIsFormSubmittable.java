package org.jsoup.parser;

public class GeneratedTestIsFormSubmittable {

    @Test
    public void testIsFormSubmittable() {
        Tag value = org.jsoup.parser.Tag.form();
        boolean expected = false;
        boolean result = org.jsoup(parser).Tag.isFormSubmittable(value, expected);
        assert result == expected : "Test failed";
    }

}