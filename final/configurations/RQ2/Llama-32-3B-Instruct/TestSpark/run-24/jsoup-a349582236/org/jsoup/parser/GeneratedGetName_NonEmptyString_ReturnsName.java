package org.jsoup.parser;

public class GeneratedGetName_NonEmptyString_ReturnsName {

    @Test
    public void getName_NonEmptyString_ReturnsName() {
        String name = "div";
        Tag tag = new Tag();
        tag.setName(name);
        assertEquals(name, tag.getName());
    }

}