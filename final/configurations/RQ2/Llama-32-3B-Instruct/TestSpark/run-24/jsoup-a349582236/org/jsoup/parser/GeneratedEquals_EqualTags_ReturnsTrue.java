package org.jsoup.parser;

public class GeneratedEquals_EqualTags_ReturnsTrue {

    @Test
    public void equals_EqualTags_ReturnsTrue() {
        String name1 = "div";
        String name2 = "div";
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        tag1.setName(name1);
        tag2.setName(name2);
        assertTrue(tag1.equals(tag2));
    }

}