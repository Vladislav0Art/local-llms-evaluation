package org.jsoup.parser;

public class GeneratedNormalName_AcceptableTagName_ReturnsSameName {

    @Test
    public void normalName_AcceptableTagName_ReturnsSameName() {
        String name = "span";
        Tag tag = new Tag();
        tag.setName(name);
        assertEquals(name, tag.normalName());
    }

}