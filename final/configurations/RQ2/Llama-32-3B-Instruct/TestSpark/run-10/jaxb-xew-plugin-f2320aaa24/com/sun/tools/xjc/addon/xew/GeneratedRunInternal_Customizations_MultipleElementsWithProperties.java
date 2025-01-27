package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedRunInternal_Customizations_MultipleElementsWithProperties {

    @Test
    public void runInternal_Customizations_MultipleElementsWithProperties() throws ClassNotFoundException, IOException {
        // Arrange
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        CommonConfiguration configuration = new CommonConfiguration();

        CPropertyInfo[] properties = new CPropertyInfo[]{new CPropertyInfo(QName.valueOf("test1"), "type", null),
                new CPropertyInfo(QName.valueOf("test2"), "type", null)};
        configuration.setPropertyInfos(properties);

        plugin.setConfig(configuration);

        Outline outline = new ClassOutline();

        // Act and Assert
        plugin.runInternal(outline);
        assertEquals(3, outline.getClasses().size());
    }

}