package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedRunInternal_RunWithInvalidOutline_ThrowsClassNotFoundException {

    @Test
    public void runInternal_RunWithInvalidOutline_ThrowsClassNotFoundException() throws IOException, ClassNotFoundException {
        // Arrange
        Outline invalidOutline = new Outline();
        invalidOutline.getClass(); // Just to make the compiler happy

        // Act and Assert
        assertThrows(ClassNotFoundException.class, () -> XmlElementWrapperPlugin.class.newInstance().runInternal(invalidOutline));
    }

}