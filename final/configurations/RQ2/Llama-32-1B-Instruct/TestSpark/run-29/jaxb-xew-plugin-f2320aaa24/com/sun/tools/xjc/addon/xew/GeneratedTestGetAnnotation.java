package com.sun.tools.xjc.addon.xew;

import static com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin.*;

public class GeneratedTestGetAnnotation {

    @Test
    public void testGetAnnotation() {
        JAnnotatable annot = getAnnotation(XMLElementWrapper.class).getAnnotation();
        assert annot != null;
        List<AnnotationArrayMember> arrayMembers = getAnnotation(XMLElementWrapper.class).getAnnotationArray();
        assert arrayMembers.size() == 1;

        String name = (String) getAnnotation(XMLElementWrapper.class).getName();
        System.out.println(name);
    }

}