package org.jsoup.parser;

public class GeneratedTestSetName {

    private String name;

    public Tag() {
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
    public void testSetName() {
        // Arrange
        Tag tag = new Tag();
        String expectedName = "newTest";

        // Act
        tag.setName(expectedName);

        // Assert
        assertEquals(expectedName, tag.getName());
    }

}