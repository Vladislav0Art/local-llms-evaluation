package org.jsoup.parser;

public class GeneratedTest {

    private String name;

    public Tag(String name) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class TagTest {

    @Test
    public void valueOf_NewGenericTag() {
        Tag result = Tag.valueOf("test", null);
        assertNotNull(result);
    }

    @Test
    public void isKnownTag_NewGenericTag() {
        assertTrue(Tag.isKnownTag("test"));
    }

    @Test
    public void testTagsetName() {
        // Arrange
        Tag tag = new Tag("test");

        // Act
        tag.setName("newTest");

        // Assert
        assertEquals("newTest", tag.getName());
    }
}

class Tag {
    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}