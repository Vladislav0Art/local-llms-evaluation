package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedRunInternal_setsWrappedElementValue {

    @Test
    public void runInternal_setsWrappedElementValue() throws IOException, ClassNotFoundException {
        // Arrange
        Outline outline = new Outline();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();

        // Act
        plugin.runInternal(outline);

        // Assert
        JFieldVar wrappedElementValue = outline.getGeneratedClasses().get(0).getFields().get("wrappedElementValue");
        assertNotNull(wrappedElementValue);
    }

}