package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCopyFields_CopiesFieldsFromSourceToTarget {

    @Test
    public void copyFields_CopiesFieldsFromSourceToTarget() {
        // Arrange
        Object source = new Object();
        Object target = new Object();

        // Act
        XmlElementWrapperPlugin.copyFields(source, target);

        // Assert
        assertEquals(source.getClass(), target.getClass());
    }

}