package org.jsoup.parser;

public class GeneratedTest {

    // Tests for getName()

    @Test
    public void getNameNullTest() {
        Tag tag = new Tag();
        String actualName = tag.getName();
        assertNull("Name should be null", actualName);
    }

    @Test
    public void getNameNotNullTest() {
        Tag tag = new Tag("div");
        String actualName = tag.getName();
        assertNotNull("Name should not be null", actualName);
    }

    @Test
    public void getNameCorrectTest() {
        Tag tag = new Tag("div");
        String actualName = tag.getName();
        String expectedName = "div";
        assertEquals("Incorrect name", expectedName, actualName);
    }

    @Test
    public void normalNameNullTest() {
        Tag tag = new Tag();
        String actualName = tag.normalName();
        assertNull("Name should be null", actualName);
    }

    @Test
    public void normalNameNotNullTest() {
        Tag tag = new Tag("div");
        String actualName = tag.normalName();
        assertNotNull("Name should not be null", actualName);
    }

    @Test
    public void normalNameCorrectTest() {
        Tag tag = new Tag("div");
        String actualName = tag.normalName();
        String expectedName = "div";
        assertEquals("Incorrect name", expectedName, actualName);
    }

    @Test
    public void valueOfNullTest() {
        Tag tag = Tag.valueOf(null, null);
        assertNull("Tag should be null", tag);
    }

    @Test
    public void valueOfNotNullTest() {
        Tag tag = Tag.valueOf("div", null);
        assertNotNull("Tag should not be null", tag);
    }

}