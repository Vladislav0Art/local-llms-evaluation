package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedRunInternal_Customizations_MultipleElements {

    @Test
    public void runInternal_Customizations_MultipleElements() throws ClassNotFoundException, IOException {
        // Arrange
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        CommonConfiguration configuration = new CommonConfiguration();
        configuration.addPropertyInfo(new CPropertyInfo(QName.valueOf("test"), "type", null));
        plugin.setConfig(configuration);

        Outline outline = new ClassOutline();

        // Act and Assert
        plugin.runInternal(outline);
        assertEquals(1, outline.getClasses().size());
    }

}