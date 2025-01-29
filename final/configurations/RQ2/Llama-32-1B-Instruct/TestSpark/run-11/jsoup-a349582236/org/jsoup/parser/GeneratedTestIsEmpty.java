package org.jsoup.parser;

public class GeneratedTestIsEmpty {

    @Before
    public void setup() {
    }

    @Test
    public void testIsEmpty() {
        Tag tag1 = new Tag();
        assertTrue(tag1.isEmpty());
        Tag tag2 = new Tag();
        assertFalse(tag2.isEmpty());
    }

}