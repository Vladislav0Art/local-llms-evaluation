package com.sun.tools.xjc.addon.xew;

import static com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin.*;

public class GeneratedTest {

    @Test
    public void testGetAnnotation() {
        JAnnotatable annot = getAnnotation(XMLElementWrapper.class).getAnnotation();
        assert annot != null;
        List<AnnotationArrayMember> arrayMembers = getAnnotation(XMLElementWrapper.class).getAnnotationArray();
        assert arrayMembers.size() == 1;

        String name = (String) getAnnotation(XMLElementWrapper.class).getName();
        System.out.println(name);
    }

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

    @Test
    public void testGetPrivateFields() {
        JClass classObj = getPackage().loadClass("com.sun.tools.xjc.addon.xew.MyElement");
        List<JFieldVar> fieldVars = (List<JFieldVar>) classObj.getMethod("getPrivateFields").invoke(null);
        for (JFieldVar fieldVar : fieldVars) {
            System.out.println(fieldVar.getName());
        }
    }

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