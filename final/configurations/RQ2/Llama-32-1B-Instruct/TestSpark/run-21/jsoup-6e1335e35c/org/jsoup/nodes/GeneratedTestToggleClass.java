package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestToggleClass {

    @Test
    public void testToggleClass() {
        // Arrange
        String className = "test-class";

        // Act
        Element element = new MyElement();
        element.toggleClass(className);

        // Assert
        assertEquals(className, element.getClassName());

        // Assert
        assertTrue(element.getClassName().isEmpty());
    }

}