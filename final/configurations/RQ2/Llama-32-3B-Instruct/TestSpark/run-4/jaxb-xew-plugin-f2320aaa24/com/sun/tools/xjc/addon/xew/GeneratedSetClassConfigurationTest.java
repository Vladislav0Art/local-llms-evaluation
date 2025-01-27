package com.sun.tools.xjc.addon.xew;

public class GeneratedSetClassConfigurationTest {

    @Test
    public void setClassConfigurationTest() {
        // Test case: Set class configuration for the plugin
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        ClassConfiguration config = new ClassConfiguration();
        plugin.setClassConfiguration(config);
        assertEquals(config, plugin.getClassConfiguration());
    }

}