package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAddClass {

    @Test
    public void testAddClass() {
        // Arrange
        String className = "test-class";
        Element element = new MyElement();

        // Act
        element.addClass(className);

        // Assert
        assertEquals(className, element.getClassName());
    }

}