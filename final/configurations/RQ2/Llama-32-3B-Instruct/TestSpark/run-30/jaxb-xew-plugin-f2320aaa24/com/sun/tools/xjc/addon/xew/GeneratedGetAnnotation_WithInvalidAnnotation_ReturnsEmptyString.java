package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneratedGetAnnotation_WithInvalidAnnotation_ReturnsEmptyString {

    @Test
    public void getAnnotation_WithInvalidAnnotation_ReturnsEmptyString() throws IOException, ClassNotFoundException {
        // Arrange
        Outline outline = new Outline();
        ClassConfiguration configuration = new ClassConfiguration();

        XmlElementWrapperPlugin plugin = XmlElementWrapperPlugin.class.newInstance();

        // Act
        String result = plugin.getAnnotation(outline);

        // Assert
        assertEquals("", result);
    }

}