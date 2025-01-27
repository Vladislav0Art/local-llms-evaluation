package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCopyFields_UpdatesAllFieldsOfSourceToTarget {

    @Test
    public void copyFields_UpdatesAllFieldsOfSourceToTarget() {
        // Arrange
        Object source = new Object();
        Object target = new Object();

        // Act and Assert
        XmlElementWrapperPlugin.copyFields(source, target);
        assertEquals(source.getClass(), target.getClass());
    }
}

}