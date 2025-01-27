package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetAnnotation_GettingNullObject_ReturnsNull {

    @Test
    public void getAnnotation_GettingNullObject_ReturnsNull() {
        // Arrange
        Object object = null;

        // Act and Assert
        assertNull(XmlElementWrapperPlugin.getAnnotation(object));
    }
}

}