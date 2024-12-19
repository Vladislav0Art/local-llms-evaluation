package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.config.ConfigurablePlugin;
import org.junit.jupiter.api.Test;

public class GeneratedTestRunInternal_NoConfiguration {

    @Test
    public void testRunInternal_NoConfiguration() {
        // Arrange
        Outline outline = new Outline();

        // Act
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.runInternal(outline);
            fail("Expected an InvalidXmlFileException");
        } catch (InvalidXmlFileException e) {
        }
    }

}