package com.sun.tools.xjc.addon.xew;

public class Generated[XmlElementWrapper]

Test4 {

    @Test
    public void [XmlElementWrapper]Test4() {
        JAnnotatable annot = new JAnnotatable();
        JAnnotationRef ref = new JAnnotationRef(annot, "example");
        assert ref.getDeclaringClass() == null;

        JAnnotatable otherAnnot = new JAnnotatable();
        JAnnotationArrayMember arrayMember = (JAnnotationArrayMember) addAnnotation(otherAnnot, "otherExample");
    }

}