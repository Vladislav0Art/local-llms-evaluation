package org.jsoup.parser;

public class GeneratedTest {

    private String name;

    public static class Tag {
        public Tag(String name) throws NullPointerException {
            if (name == null) {
                throw new NullPointerException("Name cannot be null");
            }
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static String normalName(String tagName) {
            return Normalizer.nfc(tagName).toString();
        }
    }

    @Test
    public void testEmptyTagNameReturnUnknownTagTest() {
        Tag tag = Tag.valueOf("");
        assertTrue(!tag.isKnownTag());
    }

    @Test
    public void testUnknownTagNameReturnUnknownTagTest() {
        Tag tag = Tag.valueOf("abc");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void testUnknownTagNamePreserveWhitespaceReturnsFalseTest() {
        Tag tag = Tag.valueOf("abc");
        assertFalse(tag.preserveWhitespace());
    }

    @Test
    public void testUnknownTagNameIsSubmittableReturnsTrueTest() {
        Tag tag = Tag.valueOf("abc");
        assertTrue(tag.isFormSubmittable());
    }

}