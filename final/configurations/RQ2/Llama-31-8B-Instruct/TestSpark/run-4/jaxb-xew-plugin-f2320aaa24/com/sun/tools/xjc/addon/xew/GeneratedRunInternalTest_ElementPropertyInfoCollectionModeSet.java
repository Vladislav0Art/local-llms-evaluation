package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalTest_ElementPropertyInfoCollectionModeSet {

    @Test
    public void runInternalTest_ElementPropertyInfoCollectionModeSet() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        CElementPropertyInfo propertyInfo = new CElementPropertyInfo();
        propertyInfo.setCollectionMode(CollectionMode.SET);
        when(plugin.getConfiguration()).thenReturn(new ClassConfiguration());
        Outline outline = new Outline();
        plugin.runInternal(outline);
        assertNotNull(outline);
    }

}