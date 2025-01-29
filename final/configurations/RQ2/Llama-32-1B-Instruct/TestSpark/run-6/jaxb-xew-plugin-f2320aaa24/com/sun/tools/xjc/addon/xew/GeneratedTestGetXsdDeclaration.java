package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetXsdDeclaration {

    @Test
    public void testGetXsdDeclaration() {
        JAnnotatable annotatable = XmlElementWrapper.class;
        String xsdDeclaration = null;
        assertNotNull(CommonUtils.getXsdDeclaration(annotatable));
    }

}