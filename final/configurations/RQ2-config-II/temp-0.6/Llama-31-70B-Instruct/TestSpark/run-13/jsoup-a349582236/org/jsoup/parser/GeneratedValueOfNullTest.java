package org.jsoup.parser;

public class GeneratedValueOfNullTest {

    // Tests for getName()

    @Test
    public void valueOfNullTest() {
        Tag tag = Tag.valueOf(null, null);
        assertNull("Tag should be null", tag);
    }

}