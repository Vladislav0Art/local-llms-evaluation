package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetXsdDeclaration {

    @Test
    public void testSetXsdDeclaration() {
        JClass container = getPackage().getDomain();
        JAnnotatable annotatable = container.addJAnnotatable(new JAnnotationArrayMember("class", "com.sun.tools.xjc.addon.xew.XMLElementWrapper"));
        JMethod method = container.addJMethod("setXsdDeclaration(String xsd)", "public void setXsdDeclaration(String xsd)");
        annotatable.setAnnotation(method);
    }

}