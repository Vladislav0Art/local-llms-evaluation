package org.jsoup.parser;

public class GeneratedClone_ClonedTag_ReturnsSameInstance {

    private Tag tag;

    @Test
    public void clone_ClonedTag_ReturnsSameInstance() {
        tag = new Tag();
        Tag cloned = (Tag) tag.clone();
        assertEquals(tag, cloned);
    }

}