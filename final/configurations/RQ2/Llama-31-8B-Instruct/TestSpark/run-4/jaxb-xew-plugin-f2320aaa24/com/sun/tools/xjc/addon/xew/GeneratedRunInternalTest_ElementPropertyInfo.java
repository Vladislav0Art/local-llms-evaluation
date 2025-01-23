package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalTest_ElementPropertyInfo {

    @Test
    public void runInternalTest_ElementPropertyInfo() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        CElementPropertyInfo propertyInfo = new CElementPropertyInfo();
        when(plugin.getConfiguration()).thenReturn(new ClassConfiguration());
        Outline outline = new Outline();
        plugin.runInternal(outline);
        assertNotNull(outline);
    }

}