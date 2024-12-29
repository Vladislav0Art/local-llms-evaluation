package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFields {

    @Test
    public void testCopyFields() {
        JClass clazz = getTestClass("com.sun.tools.xjc.addon.xew.TestXmlElementWrapperPlugin");
        List<JCField> fields = clazz.getDeclaredFields();
        Collection<JCField> copiedFields = new ArrayList<>();
        for (JCField field : fields) {
            copyFields(field, copiedFields);
        }
    }

}