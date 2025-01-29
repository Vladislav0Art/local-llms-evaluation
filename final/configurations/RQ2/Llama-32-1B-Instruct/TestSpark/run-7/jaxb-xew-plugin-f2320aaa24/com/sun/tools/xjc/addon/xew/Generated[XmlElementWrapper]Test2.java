package com.sun.tools.xjc.addon.xew;

public class Generated[XmlElementWrapper]

Test2 {

    @Test
    public void [XmlElementWrapper]Test2() {
        JClass container = (JClass) copyFields(new JDefinedClass("container", "Container"));
        JAnnotatable annot = new JAnnotatable();
        JAnnotationArrayMember arrayMember = (JAnnotationArrayMember) addAnnotation(annot, "example");
        assert arrayMember.getMembers().size() == 1;
    }

}