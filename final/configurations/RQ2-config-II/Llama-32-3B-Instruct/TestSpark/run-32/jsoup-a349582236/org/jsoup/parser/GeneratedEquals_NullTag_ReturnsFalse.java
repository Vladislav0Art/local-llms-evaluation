package org.jsoup.parser;

public class GeneratedEquals_NullTag_ReturnsFalse {

    @Test
    public void equals_NullTag_ReturnsFalse() {
        Tag tag1 = new Tag();
        Tag tag2 = null;
        assertFalse(tag1.equals(tag2));
    }

}