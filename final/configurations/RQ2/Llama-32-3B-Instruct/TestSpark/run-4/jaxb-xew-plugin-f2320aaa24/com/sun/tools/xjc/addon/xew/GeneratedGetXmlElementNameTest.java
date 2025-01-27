package com.sun.tools.xjc.addon.xew;

public class GeneratedGetXmlElementNameTest {

    @Test
    public void getXmlElementNameTest() {
        // Test case: Get the element name from the plugin
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        String elementName = plugin.getXsdDeclaration().getXmlElementName();
        assertNotNull(elementName);
    }

}