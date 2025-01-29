package com.sun.tools.xjc.addon.xew;

public class Generated[XmlElementWrapper]

Test {

    @Test
    public void [XmlElementWrapper]Test() {
        JAnnotatable annot = new JAnnotatable();
        JAnnotationArrayMember arrayMember = (JAnnotationArrayMember) addAnnotation(annot, "example");
        assert arrayMember.getMembers().size() == 1;

        JAnnotationUse use = new JAnnotationUse("use");
        JAnnotationValue value = getAnnotation(value, use);
        assert value.toString().contains("example");

        JClass container = new JClass("com.example.container", "Container");
        JClass jclass = (JClass) copyFields(container);
        assert jclass.getName() == "Container";

        JFieldVar field = new JFieldVar("field", "String", jclass, 0);
        assert ObjectUtils.isPrimitive(field.getType());
    }

}