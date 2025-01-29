package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetXmlType {

    @Test
    public void testGetXmlType() {
        JClass jclass = getJClass();
        assertEquals("com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin", jclass.getName());
        assertEquals(ClassConfiguration.classification(), jclass.getAnnotation(CustomizationUtils.CUSTOMIZATION_CLASS));
    }

}