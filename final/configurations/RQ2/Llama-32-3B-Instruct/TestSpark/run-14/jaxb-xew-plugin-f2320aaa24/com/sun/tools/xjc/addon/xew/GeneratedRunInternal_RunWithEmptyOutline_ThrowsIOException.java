package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedRunInternal_RunWithEmptyOutline_ThrowsIOException {

    @Test
    public void runInternal_RunWithEmptyOutline_ThrowsIOException() throws IOException, ClassNotFoundException {
        // Arrange
        Outline emptyOutline = new Outline();

        // Act and Assert
        assertThrows(IOException.class, () -> XmlElementWrapperPlugin.class.newInstance().runInternal(emptyOutline));
    }
}

}