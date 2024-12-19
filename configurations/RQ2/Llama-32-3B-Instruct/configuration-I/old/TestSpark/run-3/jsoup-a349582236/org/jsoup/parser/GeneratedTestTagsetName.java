package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestTagsetName {

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