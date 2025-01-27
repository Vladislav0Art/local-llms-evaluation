package org.jsoup.parser;

public class GeneratedToString_AcceptableTagsReturnCorrectString_ReturnsSameString {

    @Test
    public void toString_AcceptableTagsReturnCorrectString_ReturnsSameString() {
        String name = "div";
        Tag tag = new Tag();
        tag.setName(name);
        assertEquals(name, tag.toString());
    }

}