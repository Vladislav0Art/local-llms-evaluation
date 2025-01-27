package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCopyFields_UpdatesPrivateFieldsOfSourceToTarget {

    @Test
    public void copyFields_UpdatesPrivateFieldsOfSourceToTarget() {
        // Arrange
        Object source = new Object();
        Object target = new Object();

        // Act and Assert
        XmlElementWrapperPlugin.copyFields(source, target);
        assertTrue(getPrivateField(source, "privateField") == null && getPrivateField(target, "privateField") != null);
    }

}