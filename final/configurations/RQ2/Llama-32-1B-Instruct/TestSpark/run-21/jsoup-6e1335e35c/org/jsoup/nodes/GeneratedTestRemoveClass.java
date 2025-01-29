package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestRemoveClass {

    @Test
    public void testRemoveClass() {
        // Arrange
        String className = "test-class";
        Element element = new MyElement();
        element.removeClass(className);

        // Act
        assertNotEquals(className, element.getClassName());

        // Assert
        assertTrue(element.getClassName().isEmpty());
    }

}