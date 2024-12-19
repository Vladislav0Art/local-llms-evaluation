package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.config.ConfigurablePlugin;
import org.junit.jupiter.api.Test;

public class GeneratedTestRunInternal_InvalidInput {

    @Test
    public void testRunInternal_InvalidInput() {
        // Arrange
        Outline outline = new Outline();
        try {
            XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
            plugin.runInternal(outline);
            fail("Expected an InvalidXmlFileException");
        } catch (ClassNotFoundException e) {
        }
    }

}