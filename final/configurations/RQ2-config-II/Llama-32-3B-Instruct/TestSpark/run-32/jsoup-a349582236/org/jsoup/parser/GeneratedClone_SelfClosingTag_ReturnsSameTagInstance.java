package org.jsoup.parser;

public class GeneratedClone_SelfClosingTag_ReturnsSameTagInstance {

    @Test
    public void clone_SelfClosingTag_ReturnsSameTagInstance() {
        String tagName = "img";
        Tag tag1 = Tag.valueOf(tagName);
        Tag tag2 = tag1.clone();
        assertNotNull(tag2);
        assertEquals(tag1, tag2);
    }

}