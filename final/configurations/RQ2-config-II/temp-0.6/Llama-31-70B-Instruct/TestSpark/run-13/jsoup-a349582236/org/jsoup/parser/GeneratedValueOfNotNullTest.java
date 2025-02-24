package org.jsoup.parser;

public class GeneratedValueOfNotNullTest {

    // Tests for getName()

    @Test
    public void valueOfNotNullTest() {
        Tag tag = Tag.valueOf("div", null);
        assertNotNull("Tag should not be null", tag);
    }

}