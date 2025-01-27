package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneratedRunInternal_WithInvalidOutline_ThrowsException {

    @Test
    public void runInternal_WithInvalidOutline_ThrowsException() throws IOException, ClassNotFoundException {
        // Arrange
        Outline outline = null;
        ClassConfiguration configuration = new ClassConfiguration();

        // Act and Assert
        try {
            XmlElementWrapperPlugin.class.newInstance().runInternal(outline);
            assert false;
        } catch (ClassNotFoundException | IOException e) {
            assertTrue(true);
        }
    }

}