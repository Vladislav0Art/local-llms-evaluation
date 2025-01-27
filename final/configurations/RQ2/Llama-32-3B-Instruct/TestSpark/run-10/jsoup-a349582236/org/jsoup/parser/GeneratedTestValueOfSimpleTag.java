package org.jsoup.parser;

public class GeneratedTestValueOfSimpleTag {

    @Mock
    private ParseSettings settings;

    @Test
    public void testValueOfSimpleTag() {
        String tagName = "tag";
        Tag tag = Tag.valueOf(tagName);
        assertNotNull(tag);
        assertEquals(tagName, tag.getName());
    }

}