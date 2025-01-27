package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedRunInternal_setsWrappedElementName {

    @Test
    public void runInternal_setsWrappedElementName() throws IOException, ClassNotFoundException {
        // Arrange
        Outline outline = new Outline();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();

        // Act
        plugin.runInternal(outline);

        // Assert
        JFieldVar wrappedElementName = outline.getGeneratedClasses().get(0).getFields().get("wrappedElementName");
        assertNotNull(wrappedElementName);
    }

}