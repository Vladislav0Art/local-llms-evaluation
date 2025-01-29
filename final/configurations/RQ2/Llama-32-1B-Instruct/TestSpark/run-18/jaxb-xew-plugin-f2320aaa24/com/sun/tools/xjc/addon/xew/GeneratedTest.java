package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

    @Test
    public void testAddElement() {
        JClassContainer classContainer = getPackage().getDomain();
        JAnnotatable annotatable = classContainer.addJAnnotatable(new JAnnotationArrayMember("class", "com.sun.tools.xjc.addon.xew.XMLElementWrapper"));
        JMethod method = classContainer.addJMethod("addElement", "public void addElement(String name)");
        annotatable.setAnnotation(method);
    }

    @Test
    public void testAddElementWithList() {
        JClass container = getPackage().getDomain();
        JAnnotatable annotatable = container.addJAnnotatable(new JAnnotationArrayMember("class", "com.sun.tools.xjc.addon.xew.XMLElementWrapper"));
        JMethod method = container.addJMethod("addElement", "public void addElement(String[] names)");
        annotatable.setAnnotation(method);
    }

    @Test
    public void testAddElementWithMap() {
        JClass container = getPackage().getDomain();
        JAnnotatable annotatable = container.addJAnnotatable(new JAnnotationArrayMember("class", "com.sun.tools.xjc.addon.xew.XMLElementWrapper"));
        JMethod method = container.addJMethod("addElement", "public void addElement(String[] names, Map<String, Object> values)");
        annotatable.setAnnotation(method);
    }

    @Test
    public void testSetXsdDeclaration() {
        JClass container = getPackage().getDomain();
        JAnnotatable annotatable = container.addJAnnotatable(new JAnnotationArrayMember("class", "com.sun.tools.xjc.addon.xew.XMLElementWrapper"));
        JMethod method = container.addJMethod("setXsdDeclaration(String xsd)", "public void setXsdDeclaration(String xsd)");
        annotatable.setAnnotation(method);
    }

    @Test
    public void testSetPrivateField() {
        JClass container = getPackage().getDomain();
        JAnnotatable annotatable = container.addJAnnotatable(new JAnnotationArrayMember("class", "com.sun.tools.xjc.addon.xew.XMLElementWrapper"));
        JMethod method = container.addJMethod("setPrivateField(String name)", "public void setPrivateField(String name)");
        annotatable.setAnnotation(method);
    }

    @Test
    public void testGetAnnotation() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        JAnnotatable annotatable = plugin.getPackage().getDomain().addJAnnotatable(new JAnnotationArrayMember("class", "com.sun.tools.xjc.addon.xew.XMLElementWrapper"));
        plugin.setClassConfiguration(new ClassConfiguration(plugin, "com.sun.tools.xjc.addon.xew"));
    }

}