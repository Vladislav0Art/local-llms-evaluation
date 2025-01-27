package org.jsoup.parser;

public class GeneratedEquals_NonEqualTags_ReturnsFalse {

    @Test
    public void equals_NonEqualTags_ReturnsFalse() {
        String name1 = "div";
        String name2 = "span";
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        tag1.setName(name1);
        tag2.setName(name2);
        assertFalse(tag1.equals(tag2));
    }

}