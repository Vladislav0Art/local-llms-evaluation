package org.jsoup.parser;

public class GeneratedHashCode_AcceptableTagsHaveSameHashcode_ReturnsSameHashcode {

    @Test
    public void hashCode_AcceptableTagsHaveSameHashcode_ReturnsSameHashcode() {
        String name1 = "div";
        String name2 = "div";
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        tag1.setName(name1);
        tag2.setName(name2);
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

}