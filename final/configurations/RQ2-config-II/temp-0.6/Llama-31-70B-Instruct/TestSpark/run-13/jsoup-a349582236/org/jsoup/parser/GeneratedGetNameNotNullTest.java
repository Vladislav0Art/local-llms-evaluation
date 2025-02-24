package org.jsoup.parser;

public class GeneratedGetNameNotNullTest {

    // Tests for getName()

    @Test
    public void getNameNotNullTest() {
        Tag tag = new Tag("div");
        String actualName = tag.getName();
        assertNotNull("Name should not be null", actualName);
    }

}