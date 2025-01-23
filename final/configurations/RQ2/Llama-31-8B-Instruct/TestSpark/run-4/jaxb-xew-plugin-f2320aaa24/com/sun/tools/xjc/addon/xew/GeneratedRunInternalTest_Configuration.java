package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalTest_Configuration {

    @Test
    public void runInternalTest_Configuration() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        ClassConfiguration config = new ClassConfiguration();
        when(plugin.getConfiguration()).thenReturn(config);
        Outline outline = new Outline();
        plugin.runInternal(outline);
        assertNotNull(outline);
    }

}