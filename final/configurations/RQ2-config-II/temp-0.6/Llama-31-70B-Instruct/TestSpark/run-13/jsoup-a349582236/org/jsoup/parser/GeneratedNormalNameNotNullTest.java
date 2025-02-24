package org.jsoup.parser;

public class GeneratedNormalNameNotNullTest {

    // Tests for getName()

    @Test
    public void normalNameNotNullTest() {
        Tag tag = new Tag("div");
        String actualName = tag.normalName();
        assertNotNull("Name should not be null", actualName);
    }

}