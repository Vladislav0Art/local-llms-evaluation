package org.jsoup.parser;

public class GeneratedTestIsFormInput {

    @Test
    public void testIsFormInput() {
        Tag tag = new TagImpl("input", false);
        assertTrue(tag.isFormInput());

        String tagName = "textarea";
        Tag valueOfTag = Tag.valueOf(tagName, null);
        assertFalse(valueOfTag.isFormInput());
    }
}

class IsKnownTagUtil {

    public static boolean isKnownTag(String tagName) {
        // Implement logic to check if the given tag name is a known HTML tag
    }

    private static class HelperClass {
        public boolean testFunction1() {
            return true;
        }

        public boolean testFunction2() {
            return false;
        }
    }

}