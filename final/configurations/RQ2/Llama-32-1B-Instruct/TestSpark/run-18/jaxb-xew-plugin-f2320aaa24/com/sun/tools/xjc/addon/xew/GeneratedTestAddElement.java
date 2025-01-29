package com.sun.tools.xjc.addon.xew;

public class GeneratedTestAddElement {

    @Test
    public void testAddElement() {
        JClassContainer classContainer = getPackage().getDomain();
        JAnnotatable annotatable = classContainer.addJAnnotatable(new JAnnotationArrayMember("class", "com.sun.tools.xjc.addon.xew.XMLElementWrapper"));
        JMethod method = classContainer.addJMethod("addElement", "public void addElement(String name)");
        annotatable.setAnnotation(method);
    }

}