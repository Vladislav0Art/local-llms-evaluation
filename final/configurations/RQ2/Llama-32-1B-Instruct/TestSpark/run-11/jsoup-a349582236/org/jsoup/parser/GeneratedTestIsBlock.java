package org.jsoup.parser;

public class GeneratedTestIsBlock {

    @Before
    public void setup() {
    }

    @Test
    public void testIsBlock() {
        Tag tag1 = new Tag();
        assertTrue(tag1.isBlock());
        Tag tag2 = new Tag();
        assertFalse(tag2.isBlock());
    }

}