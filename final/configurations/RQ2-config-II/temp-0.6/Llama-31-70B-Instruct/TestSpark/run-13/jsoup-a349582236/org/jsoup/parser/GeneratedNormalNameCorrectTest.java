package org.jsoup.parser;

public class GeneratedNormalNameCorrectTest {

    // Tests for getName()

    @Test
    public void normalNameCorrectTest() {
        Tag tag = new Tag("div");
        String actualName = tag.normalName();
        String expectedName = "div";
        assertEquals("Incorrect name", expectedName, actualName);
    }

}