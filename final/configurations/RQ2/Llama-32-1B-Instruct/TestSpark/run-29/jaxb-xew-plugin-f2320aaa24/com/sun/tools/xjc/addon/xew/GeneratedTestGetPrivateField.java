package com.sun.tools.xjc.addon.xew;

import static com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin.*;

public class GeneratedTestGetPrivateField {

    @Test
    public void testGetPrivateField() {
        JClass classObj = getPackage().loadClass("com.sun.tools.xjc.addon.xew.MyElement");
        JMethod method = (JMethod) classObj.getMethod("getPrivateField", String.class).invoke(null);
        assert method != null;
        String fieldName = (String) method.invoke(null, "name");

        JAnnotatable annot = getAnnotation(XMLElementWrapper.class);
        Object member = copyField(annot, fieldName);
        System.out.println(member);
    }

}