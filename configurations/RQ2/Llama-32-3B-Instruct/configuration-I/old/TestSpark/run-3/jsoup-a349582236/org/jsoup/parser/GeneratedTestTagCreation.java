package org.jsoup.parser;

public class GeneratedTestTagCreation {

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
    public void testTagCreation() {
        // Arrange
        Tag tag = new Tag();

        // Act & Assert
        assertNotNull(tag);
        assertTrue(tag.getName().isEmpty());
    }

}