package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFields {

    @Test
    public void testCopyFields() {
        JClass clazz = CommonUtils.getJClass(XmlElementWrapper.class);
        List<JFieldVar> fields = CommonUtils.getFields(clazz);
        assertNotNull(fields);
        for (JFieldVar field : fields) {
            assertNotNull(field.getName());
        }
    }

}