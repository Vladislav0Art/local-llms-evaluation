package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotation {

    @Test
    public void testGetAnnotation() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        JAnnotatable annotatable = plugin.getPackage().getDomain().addJAnnotatable(new JAnnotationArrayMember("class", "com.sun.tools.xjc.addon.xew.XMLElementWrapper"));
        plugin.setClassConfiguration(new ClassConfiguration(plugin, "com.sun.tools.xjc.addon.xew"));
    }

}