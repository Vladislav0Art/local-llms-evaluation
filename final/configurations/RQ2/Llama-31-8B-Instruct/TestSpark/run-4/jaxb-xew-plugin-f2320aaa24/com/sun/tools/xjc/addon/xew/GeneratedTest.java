package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void runInternalTest_NoConfig() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = new Outline();
        plugin.runInternal(outline);
        assertNotNull(outline);
    }

    @Test
    public void runInternalTest_Configuration() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        ClassConfiguration config = new ClassConfiguration();
        when(plugin.getConfiguration()).thenReturn(config);
        Outline outline = new Outline();
        plugin.runInternal(outline);
        assertNotNull(outline);
    }

    @Test
    public void runInternalTest_ElementPropertyInfo() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        CElementPropertyInfo propertyInfo = new CElementPropertyInfo();
        when(plugin.getConfiguration()).thenReturn(new ClassConfiguration());
        Outline outline = new Outline();
        plugin.runInternal(outline);
        assertNotNull(outline);
    }

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

    @Test
    public void runInternalTest_ElementPropertyInfoCollectionModeList() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        CElementPropertyInfo propertyInfo = new CElementPropertyInfo();
        propertyInfo.setCollectionMode(CollectionMode.LIST);
        when(plugin.getConfiguration()).thenReturn(new ClassConfiguration());
        Outline outline = new Outline();
        plugin.runInternal(outline);
        assertNotNull(outline);
    }

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