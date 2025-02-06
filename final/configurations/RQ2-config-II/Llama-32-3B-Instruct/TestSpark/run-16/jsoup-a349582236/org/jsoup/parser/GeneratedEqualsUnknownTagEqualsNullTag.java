package org.jsoup.parser;

public class GeneratedEqualsUnknownTagEqualsNullTag {

    @Test
    public void equalsUnknownTagEqualsNullTag() {
        Tag tag1 = Tag.valueOf("input");
        Tag tag2 = Tag.valueOf("img");
        Assert.assertFalse(tag1.equals(tag2));
    }

}