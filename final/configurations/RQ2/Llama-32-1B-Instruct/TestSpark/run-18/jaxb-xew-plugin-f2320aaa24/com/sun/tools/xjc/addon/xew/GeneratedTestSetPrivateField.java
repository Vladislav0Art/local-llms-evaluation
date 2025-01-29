package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetPrivateField {

    @Test
    public void testSetPrivateField() {
        JClass container = getPackage().getDomain();
        JAnnotatable annotatable = container.addJAnnotatable(new JAnnotationArrayMember("class", "com.sun.tools.xjc.addon.xew.XMLElementWrapper"));
        JMethod method = container.addJMethod("setPrivateField(String name)", "public void setPrivateField(String name)");
        annotatable.setAnnotation(method);
    }

}