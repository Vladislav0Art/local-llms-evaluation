package com.sun.tools.xjc.addon.xew;

import static com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin.*;

public class GeneratedTestCopyField {

    @Test
    public void testCopyField() {
        JAnnotatable annot = getAnnotation(XMLElementWrapper.class).copyField("someFieldName");
        String name = (String) annot.getName();
        System.out.println(name);
    }

    private Object copyField(String field) {
        return "Copy Field";
    }

}