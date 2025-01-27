package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedRunInternal_addsWrappedElementToOutline {

    @Test
    public void runInternal_addsWrappedElementToOutline() throws IOException, ClassNotFoundException {
        // Arrange
        Outline outline = new Outline();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();

        // Act
        plugin.runInternal(outline);

        // Assert
        JClass wrappedClass = outline.getGeneratedClasses().get(0);
        assertNotNull(wrappedClass);
    }

}