package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalTest_ElementPropertyInfoCollectionMode {

    @Test
    public void runInternalTest_ElementPropertyInfoCollectionMode() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        CElementPropertyInfo propertyInfo = new CElementPropertyInfo();
        propertyInfo.setCollectionMode(CollectionMode.LIST);
        when(plugin.getConfiguration()).thenReturn(new ClassConfiguration());
        Outline outline = new Outline();
        plugin.runInternal(outline);
        assertNotNull(outline);
    }

}