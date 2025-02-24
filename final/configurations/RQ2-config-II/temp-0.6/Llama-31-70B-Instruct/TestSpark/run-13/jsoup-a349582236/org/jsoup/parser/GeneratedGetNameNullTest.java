package org.jsoup.parser;

public class GeneratedGetNameNullTest {

    // Tests for getName()

    @Test
    public void getNameNullTest() {
        Tag tag = new Tag();
        String actualName = tag.getName();
        assertNull("Name should be null", actualName);
    }

}