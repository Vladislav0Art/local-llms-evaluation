package org.jsoup.parser;

public class GeneratedTestTagCreation {

    @Mock
    private ParseSettings settings;

    @Test
    public void testTagCreation() {
        String tagName = "tag";
        Tag tag = new Tag(tagName);
        assertNotNull(tag);
        assertEquals(tagName, tag.getName());
    }

}