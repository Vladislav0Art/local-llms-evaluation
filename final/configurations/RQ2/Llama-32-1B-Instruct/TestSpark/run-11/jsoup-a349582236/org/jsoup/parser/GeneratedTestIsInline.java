package org.jsoup.parser;

public class GeneratedTestIsInline {

    @Before
    public void setup() {
    }

    @Test
    public void testIsInline() {
        Tag tag1 = new Tag();
        assertTrue(tag1.isInline());
        Tag tag2 = new Tag();
        assertFalse(tag2.isInline());
    }

}