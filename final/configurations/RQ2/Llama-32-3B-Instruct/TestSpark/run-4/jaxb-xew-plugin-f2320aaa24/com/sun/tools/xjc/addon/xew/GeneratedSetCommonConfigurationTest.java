package com.sun.tools.xjc.addon.xew;

public class GeneratedSetCommonConfigurationTest {

    @Test
    public void setCommonConfigurationTest() {
        // Test case: Set common configuration for the plugin
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        CommonConfiguration config = new CommonConfiguration();
        plugin.setCommonConfiguration(config);
        assertEquals(config, plugin.getCommonConfiguration());
    }

}