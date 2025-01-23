package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalTest_NoConfig {

    @Test
    public void runInternalTest_NoConfig() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = new Outline();
        plugin.runInternal(outline);
        assertNotNull(outline);
    }

}