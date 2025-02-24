package org.jsoup.parser;

public class GeneratedNormalNameNullTest {

    // Tests for getName()

    @Test
    public void normalNameNullTest() {
        Tag tag = new Tag();
        String actualName = tag.normalName();
        assertNull("Name should be null", actualName);
    }

}