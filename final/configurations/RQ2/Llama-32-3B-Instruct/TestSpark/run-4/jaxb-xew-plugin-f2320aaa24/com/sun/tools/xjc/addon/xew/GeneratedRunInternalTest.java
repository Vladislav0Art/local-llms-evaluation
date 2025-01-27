package com.sun.tools.xjc.addon.xew;

public class GeneratedRunInternalTest {

    @Test
    public void runInternalTest() throws ClassNotFoundException, IOException {
        // Test case: Run internal method of the plugin
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = new Outline();
        plugin.runInternal(outline);
    }
}

}