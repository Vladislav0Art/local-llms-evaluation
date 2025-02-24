package org.jsoup.parser;

public class GeneratedGetNameCorrectTest {

    // Tests for getName()

    @Test
    public void getNameCorrectTest() {
        Tag tag = new Tag("div");
        String actualName = tag.getName();
        String expectedName = "div";
        assertEquals("Incorrect name", expectedName, actualName);
    }

}