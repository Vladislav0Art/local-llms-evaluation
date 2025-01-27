package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetPrivateField_GettingNullObject_ThrowsNullPointerException {

    @Test
    public void getPrivateField_GettingNullObject_ThrowsNullPointerException() {
        // Arrange
        Object object = null;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> XmlElementWrapperPlugin.getPrivateField(object, "privateField"));
    }

}