package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

    @Test
    public void [XmlElementWrapper]

    Test() {
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

    @Test
    public void [XmlElementWrapper]

    Test2() {
        JClass container = (JClass) copyFields(new JDefinedClass("container", "Container"));
        JAnnotatable annot = new JAnnotatable();
        JAnnotationArrayMember arrayMember = (JAnnotationArrayMember) addAnnotation(annot, "example");
        assert arrayMember.getMembers().size() == 1;
    }

    @Test
    public void [XmlElementWrapper]

    Test3() {
        JClass container = new JDefinedClass("container", "Container");
        JFieldVar field = (JFieldVar) getPrivateField(container);
        assert ObjectUtils.isPrimitive(field.getType());
    }

    @Test
    public void [XmlElementWrapper]

    Test4() {
        JAnnotatable annot = new JAnnotatable();
        JAnnotationRef ref = new JAnnotationRef(annot, "example");
        assert ref.getDeclaringClass() == null;

        JAnnotatable otherAnnot = new JAnnotatable();
        JAnnotationArrayMember arrayMember = (JAnnotationArrayMember) addAnnotation(otherAnnot, "otherExample");
    }

    @Test
    public void [XmlElementWrapper]

    Test5() {
        JAXBElement element = new JAXBElement("example", "Element");
        JAnnotatable annot = new JAnnotatable();
        annot.setElement(element);
        JClass jclass = (JClass) copyFields(annot, "Container");
        assert jclass.getName() == "Container";
    }

}