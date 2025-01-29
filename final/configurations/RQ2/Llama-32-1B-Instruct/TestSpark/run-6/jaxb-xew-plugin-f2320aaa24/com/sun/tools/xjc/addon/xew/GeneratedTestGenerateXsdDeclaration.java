package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGenerateXsdDeclaration {

    @Test
    public void testGenerateXsdDeclaration() {
        JAnnotatable annotatable = XmlElementWrapper.class;
        String xsdDeclaration = CommonUtils.getXsdDeclaration(annotatable, "xs:element", "xi:", true);
        assertNotNull(xsdDeclaration);
    }

}