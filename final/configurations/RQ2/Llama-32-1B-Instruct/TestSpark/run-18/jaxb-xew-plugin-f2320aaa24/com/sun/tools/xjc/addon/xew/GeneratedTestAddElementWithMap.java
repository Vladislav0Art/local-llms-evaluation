package com.sun.tools.xjc.addon.xew;

public class GeneratedTestAddElementWithMap {

    @Test
    public void testAddElementWithMap() {
        JClass container = getPackage().getDomain();
        JAnnotatable annotatable = container.addJAnnotatable(new JAnnotationArrayMember("class", "com.sun.tools.xjc.addon.xew.XMLElementWrapper"));
        JMethod method = container.addJMethod("addElement", "public void addElement(String[] names, Map<String, Object> values)");
        annotatable.setAnnotation(method);
    }

}