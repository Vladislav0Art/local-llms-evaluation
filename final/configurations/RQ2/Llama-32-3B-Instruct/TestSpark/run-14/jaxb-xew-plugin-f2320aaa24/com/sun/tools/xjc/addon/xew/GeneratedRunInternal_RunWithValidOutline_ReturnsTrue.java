package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedRunInternal_RunWithValidOutline_ReturnsTrue {

    @Test
    public void runInternal_RunWithValidOutline_ReturnsTrue() throws IOException, ClassNotFoundException {
        // Arrange
        Outline outline = new Outline();

        // Act
        boolean result = XmlElementWrapperPlugin.class.newInstance().runInternal(outline);

        // Assert
        assertTrue(result);
    }

}