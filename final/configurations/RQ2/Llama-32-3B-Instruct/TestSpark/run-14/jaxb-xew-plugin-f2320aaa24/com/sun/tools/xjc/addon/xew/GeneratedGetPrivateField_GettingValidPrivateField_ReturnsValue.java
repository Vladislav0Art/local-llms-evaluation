package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetPrivateField_GettingValidPrivateField_ReturnsValue {

    @Test
    public void getPrivateField_GettingValidPrivateField_ReturnsValue() throws Exception {
        // Arrange
        JClass jClass = Class.forName("com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin");
        Object object = jClass.newInstance();
        String privateFieldValue = "privateFieldValue";

        // Act and Assert
        assertEquals(privateFieldValue, XmlElementWrapperPlugin.getPrivateField(object, "privateField"));
    }

}