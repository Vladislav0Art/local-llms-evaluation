package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetAnnotation_GettingValidAnnotation_ReturnsAnnotation {

    @Test
    public void getAnnotation_GettingValidAnnotation_ReturnsAnnotation() {
        // Arrange
        Object object = new Object();
        javax.xml.bind.annotation.XmlElement annotation = new javax.xml.bind.annotation.XmlElement();

        // Act and Assert
        assertEquals(annotation, XmlElementWrapperPlugin.getAnnotation(object));
    }

}