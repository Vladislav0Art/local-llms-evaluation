package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneratedRunInternal_WithValidOutline_ReturnsTrue {

    @Test
    public void runInternal_WithValidOutline_ReturnsTrue() throws IOException, ClassNotFoundException {
        // Arrange
        Outline outline = new Outline();
        ClassConfiguration configuration = new ClassConfiguration();

        // Act
        boolean result = XmlElementWrapperPlugin.class.newInstance().runInternal(outline);

        // Assert
        assertTrue(result);
    }

}