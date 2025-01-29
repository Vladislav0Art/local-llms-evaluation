package com.sun.tools.xjc.addon.xew;

public class GeneratedTestAddElementWithList {

    @Test
    public void testAddElementWithList() {
        JClass container = getPackage().getDomain();
        JAnnotatable annotatable = container.addJAnnotatable(new JAnnotationArrayMember("class", "com.sun.tools.xjc.addon.xew.XMLElementWrapper"));
        JMethod method = container.addJMethod("addElement", "public void addElement(String[] names)");
        annotatable.setAnnotation(method);
    }

}